package com.bmsoft.sharejdbc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 开始事件模拟的对象
 */
@Data
public class QueryLinkedEventDataDTO {

  private Integer analysisViewId;

  private Integer portfolioId;

  private String placeFilterType;

  @JsonIgnore
  private String placeFilterValue;

  private String hourType;

  private Integer hour;

  private QueryLinkedDataDTO start;


  private String horizontalValue;

  private PageDTO pageDTO;

  private List<FilterTermDTO> timeResultFilters;

  private List<FilterTermDTO> placeResultFilters;

  @JsonIgnore
  private List<QueryLinkedDataDTO> endsDTO;

}
