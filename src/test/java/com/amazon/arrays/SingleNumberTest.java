package com.amazon.arrays;

import static org.junit.Assert.*;

import com.amazon.arrays.SingleNumber;
import org.junit.Before;
import org.junit.Test;

public class SingleNumberTest {

  private SingleNumber singleNumber;

  @Before
  public void setUp() throws Exception {
    singleNumber = new SingleNumber();
  }

  @Test
  public void getSingle() {

    assertEquals(1, singleNumber.singleNumber(new int[] {2,2,1}));
    assertEquals(4, singleNumber.singleNumber(new int[] {4,1,2,1,2}));
    assertEquals(4, singleNumber.singleNumber(new int[] {4}));

  }
}