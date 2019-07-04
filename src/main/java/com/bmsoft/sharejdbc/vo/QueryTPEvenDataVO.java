package com.bmsoft.sharejdbc.vo;


import lombok.Data;

@Data
public class QueryTPEvenDataVO {

  private String timeData;

  private String placeData;

  private String tpData;

  private String relationType;

  private Integer verticalData;

  public String getTpData() {
    return tpData;
  }

  public void setTpData(String tpData) {
    this.tpData = tpData;
  }

  public String getTimeData() {
    return timeData;
  }

  public void setTimeData(String timeData) {
    this.timeData = timeData;
  }

  public String getPlaceData() {
    return placeData;
  }

  public void setPlaceData(String placeData) {
    this.placeData = placeData;
  }

  public String getRelationType() {
    return relationType;
  }

  public void setRelationType(String relationType) {
    this.relationType = relationType;
  }

  public Integer getVerticalData() {
    return verticalData;
  }

  public void setVerticalData(Integer verticalData) {
    this.verticalData = verticalData;
  }

  public QueryTPEvenDataVO() {
  }

  public QueryTPEvenDataVO(String timeData, String placeData, String relationType,
      Integer verticalData) {
    this.timeData = timeData;
    this.placeData = placeData;
    this.relationType = relationType;
    this.verticalData = verticalData;
  }
}
