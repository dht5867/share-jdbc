package com.bmsoft.sharejdbc.dto;

import java.util.List;
import lombok.Data;

@Data
public class QueryLinkedTPDataDTO {

  private String relationType;

  private HorizontalTermDTO dateTermDTO;

  private HorizontalTermDTO placeTermDTO;

  private List<FilterTermDTO> filterTermDTOS;
}
