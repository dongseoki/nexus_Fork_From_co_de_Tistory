package com.code.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonUtilsTest {


  @Test
  void allMultiply() {
    assertEquals(36, CommonUtils.allMultiply(3, 4, 3));
  }

  @Test
  void allAdd() {
    assertEquals(10, CommonUtils.allAdd(3, 4, 3));
  }
}