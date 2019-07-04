package com.bmsoft.sharejdbc.mapper;

import com.bmsoft.sharejdbc.dto.QueryEventDataDTO;
import com.bmsoft.sharejdbc.dto.QueryLinkedEventDataDTO;
import com.bmsoft.sharejdbc.dto.ViewEventDTO;
import com.bmsoft.sharejdbc.entity.EventRecord;
import com.bmsoft.sharejdbc.vo.EventCountVO;
import com.bmsoft.sharejdbc.vo.QueryEventDataVO;
import com.bmsoft.sharejdbc.vo.QueryTPEvenDataVO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface EventRecordMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(EventRecord record);

  int insertSelective(EventRecord record);

  EventRecord selectByPrimaryKey(Integer id);

  List<EventRecord> findByCondition(Map<String, Object> params);

  int updateByPrimaryKeySelective(EventRecord record);

  int updateByPrimaryKey(EventRecord record);
  /**
   * 根据纵轴和横轴，筛选条件，查询统计数据
   * @param queryEventDataDTO
   * @return
   */
  List<QueryEventDataVO> selectByQueryEventDataDTO(QueryEventDataDTO queryEventDataDTO);

  /**
   * 根据纵轴和横轴，筛选条件，查询统计数据详情
   * @param queryEventDataDTO
   * @return
   */
  List<EventRecord> selectListByQueryEventDataDTO(QueryEventDataDTO queryEventDataDTO);

  /**
   * 根据开始事件和结束事件的筛选条件
   */
  List<QueryTPEvenDataVO> selectByQueryLinkEventDataDTO(
      QueryLinkedEventDataDTO queryLinkedEventDataDTO);

  /**
   * 查询个拟合2个拟合事件的详情
   */
  List<EventRecord> selectListByQueryLinkEventDataDTO(QueryLinkedEventDataDTO queryEventDataDTO);

}
