package com.jameshskoh.apitestservice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiTestServiceApplicationTests {

  @Test
  void whenRun_shouldAlwaysPass() {
    var someValue = 1;

    Assertions.assertThat(someValue).isBetween(0, 2);
  }
}
