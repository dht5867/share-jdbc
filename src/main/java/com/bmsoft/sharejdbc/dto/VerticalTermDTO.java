package com.bmsoft.sharejdbc.dto;

import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class VerticalTermDTO implements Serializable {

  @NotEmpty(message = "指标的属性名称不能为空")
  private String attrName;


  @NotEmpty(message = "横指标的属性数据类型不能为空")
  private String attrDataType;

  @NotEmpty(message = "指标的属性对应的列不能为空")
  private String columnAttr;


  @NotEmpty(message = "统计方式不能为空")
  private String filterMethod;

  private String filterType;

  private String filterValue;

  private String startValue;

  private String endValue;

  private List<Object> listValue;


  private Boolean isFilter;


}
