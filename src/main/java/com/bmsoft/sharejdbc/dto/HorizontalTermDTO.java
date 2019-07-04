package com.bmsoft.sharejdbc.dto;

import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class HorizontalTermDTO implements Serializable {


  @NotEmpty(message = "横轴属性名称不能为空")
  private String attrName;

  @NotEmpty(message = "横轴数据类型不能为空")
  private String attrDataType;

  @NotEmpty(message = "横轴对应的列不能为空")
  private String columnAttr;

  private String filterType;

  private String dateDimension;

  private String filterValue;

  private String startValue;

  private String endValue;

  private List<Object> listValue;

  private String orderBy;

  private Boolean isFilter;



}
