package com.jameshskoh.apitestservice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void whenRun_shouldAlwaysPass() {
    var someValue = 1;

    Assertions.assertThat(someValue).isBetween(0, 2);
  }
}
