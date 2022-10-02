package com.promineotech.jeep.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.promineotech.jeep.Entity.Jeep;
import com.promineotech.jeep.Entity.JeepModel;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;


@RequestMapping("/Jeeps")
@OpenAPIDefinition(info = @Info(title = "Jeep Sales Service"), servers = {
         @Server(url = "http://localhost:8080", description = "Local server.")})


public interface JeepSalesController {
  
  List<Jeep> fetchJeeps(JeepModel model, String trim);
    }
  //@formatter :off
  @Operation(
     
      summary = " Returns a list of Jeeps",
      description = " Returns a list of Jeeps given in an optional model and/or trim",
      responses = {
          @ApiResponse(
              responseCode ="200",
              description ="A list of Jeeps Returned", 
              content = @content(mediaType ="Application/Jason",
              schema =@Schema(implementation =Jeep.class))),
          @ApiResponse(
              responseCode ="400", 
              description ="The request parameter was invalid", 
              content = @content(mediaType ="Application/Jason")),
          @ApiResponse(
              responseCode ="404", 
              description = "No Jeeps were found with these criteria ", 
              content = @content(mediaType ="Application/Jason")),
          @ApiResponse(
              responseCode ="500",
              description = "An unplanned error was occurred ", 
              content = @content(mediaType ="Application/Jason")),
              },
      parameters = {
            @parameter(
                name = "model",
                allowEmptyValue = false,
                required =false,
                description = "The model name(i.e., 'WRANGLER"),
          @Parameter(
              name = "trim",
              allowEmptyValue = false,
              required =false,
              description = "The Trim level(i.e., 'Sport'"),
      
      
      
      
     @GetMapping
     @ResponseStatus(code = HttpStatus.OK)
      List<Jeep> fetchJeeps(
          @RequestParam(required = false) 
              String model,
          @RequestParam(required = false) 
              String trim);
      
    //@formatter: on
  
}
      
