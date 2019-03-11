package com.belatrixsf.customers.rest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Value("${service.hello-message}")
  private String message;


  @RequestMapping("/hello")
  public String sayHello() {
    return StringUtils.defaultString(message, "Hello!");
  }

}
