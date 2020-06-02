package com.amazon.arrays;

import static org.junit.Assert.*;

import com.amazon.arrays.RemoveDuplicates;
import org.junit.Test;

public class RemoveDuplicatesTest {

  @Test
  public void removeDuplicates() {

    int[] array = new int[]{0,0,1,1,1,2,2,3,3,4};
    RemoveDuplicates removeDuplicates = new RemoveDuplicates();
    assertEquals(5, removeDuplicates.removeDuplicates(array));
  }
}