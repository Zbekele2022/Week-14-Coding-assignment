package com.Promineotech.Jeep.controller;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import com.promineotech.jeep.Entity.Jeep;
import com.promineotech.jeep.Entity.JeepModel;

public class fetchJeepTestSupport extends BaseTest {

  protected List<Jeep> buildExpected() {
    // TODO Auto-generated method stub
    List<Jeep> list = new LinkedList<>();
    Jeep j1 = new Jeep();

    
    //@formatter:off    
    
    list.add(Jeep.builder()
        .modelId(JeepModel.WRANGLER)
        .trimLevel("Sport")
        .numDoors(2)
        .wheelSize(17)
        .basePrice(new BigDecimal("28475.00"))
        .build());
    
    list.add(Jeep.builder()
        .modelId(JeepModel.WRANGLER)
        .trimLevel("Sport")
        .numDoors(4)
        .wheelSize(17)
        .basePrice(new BigDecimal("31975.00"))
        .build());
        return list;
    
    
 // INSERT INTO models (model_id, trim_level, num_doors, wheel_size, base_price) VALUES('WRANGLER', 'Sport', 2, 17, 28475.00);
 //INSERT INTO models (model_id, trim_level, num_doors, wheel_size, base_price) VALUES('WRANGLER', 'Sport', 4, 17, 31975.00);
   
 
  
  }
  
}
