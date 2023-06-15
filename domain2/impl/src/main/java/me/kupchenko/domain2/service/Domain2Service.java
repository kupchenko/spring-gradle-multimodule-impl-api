package me.kupchenko.domain2.service;

import lombok.AllArgsConstructor;
import me.kupchenko.domain1.api.Domain1Client;
import me.kupchenko.domain2.api.Domain2Dto1;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Domain2Service {

  private final Domain1Client domain1Client;

  public Domain2Dto1 getDomain2Dto1() {
    return new Domain2Dto1("1", "2");
  }
}
