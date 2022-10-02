package com.promineotech.jeep.controller;

import org.springframework.http.HttpStatus;

public @interface ResponseStatus {

  HttpStatus code();

}
