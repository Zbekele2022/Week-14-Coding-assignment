package com.promineotech.jeep.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.Entity.Jeep;
import com.promineotech.jeep.Entity.JeepModel;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;


@RestController 
@Slf4j
public class BasicJeepSalesController implements JeepSalesController {

  @Autowired
  @Override
  public List<Jeep> fetchJeeps(String model, String trim) {
      Log.info("model = {}, trim = {}", model,trim);
  
      return null;

  }
  @Override
  public List<Jeep> fetchJeeps(JeepModel model, String trim) {
    // TODO Auto-generated method stub
    return null;
  
}
}