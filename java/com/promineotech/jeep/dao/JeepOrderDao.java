package com.promineotech.jeep.dao;

import java.util.List;
import java.util.Optional;
import com.promineotech.jeep.Entity.Color;
import com.promineotech.jeep.Entity.Customer;
import com.promineotech.jeep.Entity.Jeep;
import com.promineotech.jeep.Entity.JeepModel;
import com.promineotech.jeep.Entity.Option;

public interface JeepOrderDao {
  List<Option> fetchOptions(List<String> optionIds);
  Optional<Customer> fetchCustomer(String customerId);
  Optional<Jeep> fetchModel(JeepModel model, String trim, int doors);
  Optional<Color> fetchColor(String colorId);
  Optional<com.promineotech.jeep.Entity.Engine> fetchEngine(String engineId);
  Optional<com.promineotech.jeep.Entity.Tire> fetchTire(String tireId);
}