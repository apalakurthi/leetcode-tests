package com.amazon.arrays;

import static org.junit.Assert.*;

import com.amazon.arrays.IntersectionOfArrays;
import org.junit.Test;

public class IntersectionOfArraysTest {

  @Test
  public void getIntersection() {
    IntersectionOfArrays intersectionOfArrays = new IntersectionOfArrays();
    assertArrayEquals(new int[]{2,2}, intersectionOfArrays.getIntersection(new int[]{1,2,2,1}, new int[]{2,2}));

  }
}