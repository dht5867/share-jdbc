package com.bmsoft.sharejdbc.controller;

import com.bmsoft.sharejdbc.dto.FilterTermDTO;
import com.bmsoft.sharejdbc.dto.PageDTO;
import com.bmsoft.sharejdbc.dto.QueryEventDataDTO;
import com.bmsoft.sharejdbc.dto.QueryLinkedEventDataDTO;
import com.bmsoft.sharejdbc.service.EventRecordService;
import com.bmsoft.sharejdbc.vo.QueryEventDataVO;
import com.bmsoft.sharejdbc.vo.QueryTPEvenDataVO;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventRecordController {

  @Autowired
  private EventRecordService eventRecordService;


  @PostMapping("/initData")
  public List<QueryEventDataVO> initData(
      @RequestBody @Valid QueryEventDataDTO queryEventDataDTO) {
    createQuery(queryEventDataDTO);
    return eventRecordService.selectByQueryEventDataDTO(queryEventDataDTO);
  }

  @PostMapping("/initLinkData")
  public List<QueryTPEvenDataVO> initLinkData(@Valid
  @RequestBody QueryLinkedEventDataDTO queryLinkedEventDataDTO) {
    if (StringUtils.isEmpty(queryLinkedEventDataDTO.getPlaceFilterType())) {
      queryLinkedEventDataDTO.setPlaceFilterType("EQUAL");
    }
    if (StringUtils.isEmpty(queryLinkedEventDataDTO.getHourType())) {
      queryLinkedEventDataDTO.setHourType("DAY");
    }
    if ("DAY".equalsIgnoreCase(queryLinkedEventDataDTO.getHourType())) {
      queryLinkedEventDataDTO.setHour(24 * queryLinkedEventDataDTO.getHour());
    }

    return eventRecordService.selectByQueryLinkEventDataDTO(queryLinkedEventDataDTO);
  }


  /**
   * 构造查询条件
   */
  private void createQuery(
      @Valid @RequestBody QueryEventDataDTO queryEventDataDTO) {
    queryEventDataDTO.setIsFilterEndNode(false);
    queryEventDataDTO.setIsFilterStartNode(false);
    if (queryEventDataDTO.getPageDTO() == null
        || queryEventDataDTO.getPageDTO().getPageNum() == null) {
      PageDTO pageDTO = new PageDTO();
      pageDTO.setPageNum(1);
      pageDTO.setPageSize(15);
      queryEventDataDTO.setPageDTO(pageDTO);
    }
    if ("Date".equalsIgnoreCase(queryEventDataDTO.getHorizontalTermDTO().getAttrDataType())
        && StringUtils.isEmpty(queryEventDataDTO.getHorizontalTermDTO().getDateDimension())) {
      queryEventDataDTO.getHorizontalTermDTO().setDateDimension("DAY");
    }
    if (StringUtils.isEmpty(queryEventDataDTO.getHorizontalTermDTO().getOrderBy())
        || queryEventDataDTO.getHorizontalTermDTO().getOrderBy() == null) {
      queryEventDataDTO.getHorizontalTermDTO().setOrderBy("asc");
    }
    //根据人员事件去找，不存在方向

    //判断筛选条件中是否出现，起始节点，结束节点
    if (queryEventDataDTO.getFilterTermDTOS() != null
        && queryEventDataDTO.getFilterTermDTOS().size() >= 0) {
      int start = 0;
      int end = 0;
      for (FilterTermDTO filterTermDTO : queryEventDataDTO.getFilterTermDTOS()) {
        if ("start_node".equalsIgnoreCase(filterTermDTO.getColumnAttr())) {
          start++;
        }
        if ("end_node".equalsIgnoreCase(filterTermDTO.getColumnAttr())) {
          end++;
        }
      }
      if (start > 0) {
        queryEventDataDTO.setIsFilterStartNode(true);
      } else {
        queryEventDataDTO.setIsFilterStartNode(false);
      }
      if (end > 0) {
        queryEventDataDTO.setIsFilterEndNode(true);
      } else {
        queryEventDataDTO.setIsFilterEndNode(false);
      }
    }
  }

}
