package com.amazon.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

  @Test
  public void reverse() {
    ReverseString reverseString = new ReverseString();
    //assertArrayEquals(new char[]{'o','l','l','e','h'}, reverseString.reverse(new char[] {'h','e','l','l','o'}));
    assertArrayEquals(new char[]{'o','l','e','h'}, reverseString.reverse(new char[] {'h','e','l','o'}));
  }
}