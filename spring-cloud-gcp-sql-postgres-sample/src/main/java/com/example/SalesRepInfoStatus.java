package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/** A house entity for the sample application. */
@Entity
public class SalesRepInfoStatus {

  @Id private Integer salesRepId;
  private Integer controlId;
  private Date loadDt;
  private String userLastModify;

  public SalesRepInfoStatus() {}

  public SalesRepInfoStatus(Integer salesRepId) {
    this.salesRepId = salesRepId;
  }

  public Integer getSalesRepId() {
    return this.salesRepId;
  }

  public void setSalesRepId(Integer salesRepId) {
    this.salesRepId = salesRepId;
  }

  public Integer getControlId() {
    return this.controlId;
  }

  public void setControlId(Integer controlId) {
    this.controlId = controlId;
  }  

  public Date getLoadDt() {
    return this.loadDt;
  }

  public void setControlId(Date loadDt) {
    this.loadDt = loadDt;
  }

  public String getUserLastModify() {
    return this.userLastModify;
  }

  public void setUserLastModify(String userLastModify) {
    this.userLastModify = userLastModify;
  }      
}