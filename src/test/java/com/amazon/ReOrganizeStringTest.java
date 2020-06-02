package com.amazon;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReOrganizeStringTest {

  @Test
  public void reOrganize() {
    ReOrganizeString reOrganizeString = new ReOrganizeString();
    assertEquals(" ", reOrganizeString.reOrganize("aaab"));
    assertEquals("aba", reOrganizeString.reOrganize("aab"));
  }
}