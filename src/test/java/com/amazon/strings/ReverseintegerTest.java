package com.amazon.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseintegerTest {

  @Test
  public void reverseInteger() {
    Reverseinteger reverseinteger = new Reverseinteger();
    assertEquals(321, reverseinteger.reverse(123));
    assertEquals(-321, reverseinteger.reverse(-123));
  }
}