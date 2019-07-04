package com.bmsoft.sharejdbc.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class QueryEventDataVO implements Serializable {

  private String horizontalData;

  private String verticalData;

  private List<TypeEventDataVO> typeEventDataVOS = new ArrayList<>();

}
