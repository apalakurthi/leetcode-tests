package com.amazon.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstUniqueCharInStringTest {

  @Test
  public void uniqueChar() {
    FirstUniqueCharInString firstUniqueCharInString = new FirstUniqueCharInString();
    assertEquals(2, firstUniqueCharInString.uniqueChar("loveleetcode"));

  }
}