package com.bmsoft.sharejdbc.vo;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class TPEventDataVO {

  private List<TypeEventDataVO> typeEventDataVOS = new ArrayList<>();

  private List<QueryEventDataVO> queryEventDataVOS = new ArrayList<>();
}
