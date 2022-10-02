package com.Promineotech.Jeep.controller;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.function.IntPredicate;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import com.promineotech.jeep.Entity.Jeep;
import com.promineotech.jeep.Entity.JeepModel;
import io.swagger.v3.oas.models.PathItem.HttpMethod;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@Sql(scripts = {
    "classpath:flyway/migrations/V1.0__Jeep_Schema.sql",
    "classpath:flyway/migrations/V1.1__Jeep_Data.sql"}, 
    config = @SqlConfig(encoding = "utf-8"))

class FetchJeepTest extends fetchJeepTestSupport {

  
  @Test  
  void testThatJeepsAreReturnedWhenAvaildModelAndTrimAreSupplied(IntPredicate actual) {
          
      // System.out.println(getBaseuri());
    // Given:  a valid model,trim and uri 
    JeepModel model = JeepModel.WRANGLER;
    String trim = "Sports";
    String uri = String.format("%S?model =%s&trim =%s", getBaseUri(),model, trim);
    
    //When:a connection is made to the uri
    ResponseEntity<List<Jeep>> response = 
    getRestTemplate().exchange(uri, HttpMethod.GET, null, 
        new ParameterizedTypeReference<>() {});
    
    
    //Then: a success (ok = 200) status code is returned
    
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
      //And: the actual list returned is the same as the expected list
    List<Jeep> expected = buildExpected();
    // System.out.println(expected);
    assertThat(response.getBody()).isEqualTo(expected);
  }

 

  private Object getRestTemplate() {
    // TODO Auto-generated method stub
    return null;
  }
}