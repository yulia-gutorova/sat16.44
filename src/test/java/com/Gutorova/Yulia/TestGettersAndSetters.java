package com.Gutorova.Yulia;

import org.junit.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TestGettersAndSetters {

     @BeforeClass
     public static void messBeforeClass()
     {
         System.out.println("----------------- Test of getters ans setters----------------");
     }

     @Test
     public void testDigitClass()
     {
          System.out.println("* Test of class Digit *");
          Number digit = new Number(1, "001","1","1");
          assertTrue(digit != null);
          assertEquals(1, digit.getDecimal_number());
          assertTrue("001".equals(digit.getBinary_number()));
          assertTrue("1".equals(digit.getOctal_number()));
          assertTrue("1".equals(digit.getHex_number()));
     }

     @Test
     public void testEvenOrOddClass()
     {
          System.out.println("* Test of EvenOrOddClass with an even number");
          EvenOrOddNumber evenOrOddNumber = new EvenOrOddNumber(775,"1100000111", "1408", "307", Boolean.FALSE, Boolean.TRUE);
          assertTrue(evenOrOddNumber != null);
          assertEquals(775, evenOrOddNumber.getDecimal_number());
          assertTrue("1100000111".equals(evenOrOddNumber.getBinary_number()));
          assertTrue("1408".equals(evenOrOddNumber.getOctal_number()));
          assertTrue("307".equals(evenOrOddNumber.getHex_number()));
          assertFalse(evenOrOddNumber.isEven);
          assertTrue(evenOrOddNumber.isOdd);
     }

     @Test
     public void testEvenOrOddClass1()
     {
          System.out.println("* Test of EvenOrOddClass with an odd number");
          EvenOrOddNumber evenOrOddNumber = new EvenOrOddNumber(774,"1100000110", "1407", "306", Boolean.TRUE, Boolean.FALSE);
          assertTrue(evenOrOddNumber != null);
          assertEquals(774, evenOrOddNumber.getDecimal_number());
          assertTrue("1100000110".equals(evenOrOddNumber.getBinary_number()));
          assertTrue("1407".equals(evenOrOddNumber.getOctal_number()));
          assertTrue("306".equals(evenOrOddNumber.getHex_number()));
          assertTrue(evenOrOddNumber.isEven);
          assertFalse(evenOrOddNumber.isOdd);
     }

}
