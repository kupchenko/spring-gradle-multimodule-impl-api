package me.kupchenko.domain2.controller;

import lombok.AllArgsConstructor;
import me.kupchenko.domain2.api.Domain2Client;
import me.kupchenko.domain2.api.Domain2Dto1;
import me.kupchenko.domain2.service.Domain2Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/domain2")
@AllArgsConstructor
public class Domain2Controller implements Domain2Client {
  private final Domain2Service domain2Service;

  @GetMapping("/test1")
  public Domain2Dto1 domain2TestEndpoint() {
    return domain2Service.getDomain2Dto1();
  }
}
