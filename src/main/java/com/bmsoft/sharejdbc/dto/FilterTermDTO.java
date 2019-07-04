package com.bmsoft.sharejdbc.dto;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class FilterTermDTO implements Serializable {

  private String attrName;

  private String attrDataType;

  private String columnAttr;

  private String filterType;

  private String dateDimension;

  private String filterValue;

  private String startValue;

  private String endValue;

  private List<Object> listValue;
}
