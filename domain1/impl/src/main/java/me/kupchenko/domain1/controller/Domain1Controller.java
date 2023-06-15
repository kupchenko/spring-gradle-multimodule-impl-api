package me.kupchenko.domain1.controller;

import lombok.AllArgsConstructor;
import me.kupchenko.domain1.api.Domain1Client;
import me.kupchenko.domain1.api.Domain1Dto1;
import me.kupchenko.domain1.service.Domain1Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/domain1")
@AllArgsConstructor
public class Domain1Controller implements Domain1Client {
  private final Domain1Service domain1Service;

  @Override
  @GetMapping("/test1")
  public Domain1Dto1 domain1TestEndpoint() {
    return domain1Service.getDomain1Dto1();
  }
}
