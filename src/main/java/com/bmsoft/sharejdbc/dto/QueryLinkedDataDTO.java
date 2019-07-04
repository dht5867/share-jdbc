package com.bmsoft.sharejdbc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import lombok.Data;

/**
 * 事件模拟单个对象添加值
 */
@Data
public class QueryLinkedDataDTO {


  private String nodeType;


  private Long neo4jId;

  private String relationType;

  private String nodeValue;

  private Integer serviceType;

  private HorizontalTermDTO dateTermDTO;

  private HorizontalTermDTO placeTermDTO;

  private List<FilterTermDTO> filterTermDTOS;
  @JsonIgnore
  private Boolean isFilterStartNode;

  @JsonIgnore
  private Boolean isFilterEndNode;
}
