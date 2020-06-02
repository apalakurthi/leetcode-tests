package com.amazon;

import static org.junit.Assert.*;

public class StringCompressionTest {

  @org.junit.Test
  public void compress() {
    StringCompression compression = new StringCompression();
    int result = compression.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'});
    System.out.println(result);
  }
}