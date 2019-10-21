package com.zlm.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientSecurityController {
  @Value("${profile}")
  private String profile;

  @GetMapping("/profile")
  public String hello1() {
    return this.profile;
  }
}
