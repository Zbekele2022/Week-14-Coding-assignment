package com.promineotech.jeep.Entity;

import java.util.List;
import lombok.Data;

@Data
public class OrderRequest {
  private String customer;
  private JeepModel model;
  private String trim;
  private int doors;
  private String color;
  private String engine;
  private String tire;

  private List<String> options;

  Object getOptions() {
    // TODO Auto-generated method stub
    return null;
  }
}