package com.amazon.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountAndSayTest {

  @Test
  public void countAndSay() {
    CountAndSay countAndSay = new CountAndSay();
    assertEquals("21", countAndSay.countAndSay(3));

  }
}