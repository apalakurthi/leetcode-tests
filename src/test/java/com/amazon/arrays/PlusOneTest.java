package com.amazon.arrays;

import static org.junit.Assert.*;

import com.amazon.arrays.PlusOne;
import org.junit.Test;

public class PlusOneTest {

  @Test
  public void testPlusOne() {
    PlusOne plusOne = new PlusOne();
    assertArrayEquals(new int[]{1,2,3}, plusOne.plusOne(new int[]{1,2,2}));
    assertArrayEquals(new int[]{9,0,0}, plusOne.plusOne(new int[]{8,9,9}));

  }
}