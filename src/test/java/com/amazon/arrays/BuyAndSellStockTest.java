package com.amazon.arrays;

import static org.junit.Assert.*;

import com.amazon.arrays.BuyAndSellStock;
import org.junit.Test;

public class BuyAndSellStockTest {

  @Test
  public void maxProfit() {
    BuyAndSellStock buyAndSellStock = new BuyAndSellStock();
    assertEquals(7, buyAndSellStock.maxProfit(new int[]{7,1,5,3,6,4}));
    assertEquals(4, buyAndSellStock.maxProfit(new int[]{1,2,3,4,5}));
  }
}