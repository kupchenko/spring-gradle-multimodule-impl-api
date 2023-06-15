package me.kupchenko.domain1.service;

import me.kupchenko.domain1.api.Domain1Dto1;
import org.springframework.stereotype.Service;

@Service
public class Domain1Service {
  public Domain1Dto1 getDomain1Dto1() {
    return new Domain1Dto1("1");
  }
}
