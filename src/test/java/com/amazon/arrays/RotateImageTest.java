package com.amazon.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotateImageTest {

  @Test
  public void rotate() {
    RotateImage rotateImage = new RotateImage();
    assertArrayEquals(new int[][]{{7,4,1},{8,5,2},{9,6,3}},
        rotateImage.rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
  }
}