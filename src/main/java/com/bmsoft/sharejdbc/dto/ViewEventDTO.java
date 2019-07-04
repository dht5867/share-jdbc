package com.bmsoft.sharejdbc.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ViewEventDTO {

  @NotNull(message = "档案袋ID不能为空")
  private Integer portfolioId;

  @NotEmpty(message = "关系类型不能为空")
  private String relationType;

  @NotNull(message = "关系的开始节点ID不能为空")
  private Long start;

  @NotNull(message = "关系的结束节点ID不能为空")
  private Long end;
}
