package com.amazon.strings;

import static org.junit.Assert.*;

import com.sun.istack.internal.Pool.Impl;
import org.junit.Test;

public class ImplStrStrTest {

  @Test
  public void contains() {
    ImplStrStr implStrStr = new ImplStrStr();

    assertEquals(-1, implStrStr.contains("mississippi", "issipi"));
  }
}