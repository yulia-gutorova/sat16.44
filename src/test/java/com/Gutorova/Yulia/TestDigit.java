package com.Gutorova.Yulia;

import org.junit.*;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;



public class TestDigit {

     Digit digit = new Digit(1, "001","1","1");

     @BeforeClass
     public static void messBeforeClass()
     {
         System.out.println("----------------- Test of Digit class ----------------");
     }

     @Test
     public void testSetNumbers()
     {
          assertEquals(1, digit.getDecimal_number());
          assertTrue("001".equals(digit.getBinary_number()));
          assertTrue("1".equals(digit.getOctal_number()));
          assertTrue("1".equals(digit.getHex_number()));

     }


}
