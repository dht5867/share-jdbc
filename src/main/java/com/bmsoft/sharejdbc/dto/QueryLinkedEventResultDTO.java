package com.bmsoft.sharejdbc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import lombok.Data;

/**
 * 事件模拟关系
 */
@Data
public class QueryLinkedEventResultDTO {

  @JsonIgnore
  private String  type;

  private String relationType;

  private Integer serviceType;

  private List<HorizontalTermDTO> horizontalTermDTOS;

  private List<FilterTermDTO> filterTermDTOS;

  private List<HorizontalTermDTO> timeDatas;

  private List<HorizontalTermDTO> placeDatas;
}
