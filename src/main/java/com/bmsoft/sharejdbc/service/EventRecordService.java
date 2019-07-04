package com.bmsoft.sharejdbc.service;


import com.bmsoft.sharejdbc.dto.QueryEventDataDTO;
import com.bmsoft.sharejdbc.dto.QueryLinkedEventDataDTO;
import com.bmsoft.sharejdbc.mapper.EventRecordMapper;
import com.bmsoft.sharejdbc.vo.QueryEventDataVO;
import com.bmsoft.sharejdbc.vo.QueryTPEvenDataVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventRecordService {


  @Autowired
  private EventRecordMapper eventRecordMapper;

  public List<QueryEventDataVO> selectByQueryEventDataDTO(QueryEventDataDTO queryEventDataDTO){

    return eventRecordMapper.selectByQueryEventDataDTO(queryEventDataDTO);
  }

  public
  List<QueryTPEvenDataVO> selectByQueryLinkEventDataDTO(
      QueryLinkedEventDataDTO queryLinkedEventDataDTO){
    return eventRecordMapper.selectByQueryLinkEventDataDTO(queryLinkedEventDataDTO);
  }
}
