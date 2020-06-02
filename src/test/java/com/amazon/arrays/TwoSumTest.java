package com.amazon.arrays;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

  @Test
  public void twosum() {
    TwoSum twoSum = new TwoSum();
    Assert.assertArrayEquals(new int[]{0, 1}, twoSum.twoSum2(new int[]{2, 7, 11, 15}, 9));
  }
}
