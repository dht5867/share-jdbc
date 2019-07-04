package com.bmsoft.sharejdbc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import lombok.Data;

@Data
public class QueryEventDataDTO {


  private Integer analysisViewId;

  private Integer portfolioId;

  private String nodeType;

  private String nodeValue;

  private Long neo4jId;

  private String relationType;

  private String startNodeValue;

  private String endNodeValue;

  private Long startNeo4jId;

  private Long endNeo4jId;


  private HorizontalTermDTO horizontalTermDTO;

  private VerticalTermDTO verticalTermDTO;

  private List<FilterTermDTO> filterTermDTOS;


  private Boolean isFilterStartNode;

  @JsonIgnore
  private Boolean isFilterEndNode;

  private PageDTO pageDTO;

}
