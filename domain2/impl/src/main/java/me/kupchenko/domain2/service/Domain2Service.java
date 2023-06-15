package me.kupchenko.domain2.service;

import me.kupchenko.domain2.api.Domain2Dto1;
import org.springframework.stereotype.Service;

@Service
public class Domain2Service {
  public Domain2Dto1 getDomain2Dto1() {
    return new Domain2Dto1("1", "2");
  }
}
