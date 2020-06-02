package com.amazon.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class AtoiTest {

  @Test
  public void getInteger() {
    Atoi atoi = new Atoi();

    assertEquals(2147483647 , atoi.getInteger("9223372036854775808"));

  }
}