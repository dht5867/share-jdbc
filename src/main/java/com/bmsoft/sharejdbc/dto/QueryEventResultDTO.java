package com.bmsoft.sharejdbc.dto;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class QueryEventResultDTO implements Serializable {

  private String relationType;


  private Integer serviceType;


  private List<HorizontalTermDTO> horizontalTermDTOS;

  private List<VerticalTermDTO> verticalTermDTOS;

  private List<FilterTermDTO> filters;
}
