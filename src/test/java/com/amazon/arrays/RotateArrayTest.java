package com.amazon.arrays;

import static org.junit.Assert.*;

import com.amazon.arrays.RotateArray;
import org.junit.Before;
import org.junit.Test;

public class RotateArrayTest {

  private RotateArray rotateArray;

  @Before
  public void setUp() throws Exception {
    rotateArray = new RotateArray();
  }

  @Test
  public void rotate1() {
    assertArrayEquals(new int[]{3,4,5,1,2}, rotateArray.rotate1(new int[]{1,2,3,4,5}, 3));
  }

  @Test
  public void rotate2() {
    assertArrayEquals(new int[]{3,4,5,1,2}, rotateArray.rotate2(new int[]{1,2,3,4,5}, 3));
  }

  @Test
  public void rotate3() {
    assertArrayEquals(new int[]{3,4,5,1,2}, rotateArray.rotate3(new int[]{1,2,3,4,5}, 3));
  }
}