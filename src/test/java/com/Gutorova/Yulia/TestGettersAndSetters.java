package com.Gutorova.Yulia;

import org.junit.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TestGettersAndSetters {

     Number digit = new Number();

     @BeforeClass
     public static void messBeforeClass()
     {
         System.out.println("----------------- Test of constructors, getters ans setters----------------");
     }


     @Test
     public void testConstructorNumberClass()
     {
          System.out.println("* Test of constructor of class Number *");
          Number digit = new Number(1, "001","1","1");
          assertTrue(digit != null);
          assertEquals(1, digit.getDecimal_number());
          assertTrue("001".equals(digit.getBinary_number()));
          assertTrue("1".equals(digit.getOctal_number()));
          assertTrue("1".equals(digit.getHex_number()));
     }

     @Test
     public void testConstructorEvenOrOddClass()
     {
          System.out.println("* Test of constructor of class EvenOrOddClass with an even number");
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
     public void testConstructorEvenOrOddClass1()
     {
          System.out.println("* Test of constructor of class EvenOrOddClass with an odd number");
          EvenOrOddNumber evenOrOddNumber = new EvenOrOddNumber(774,"1100000110", "1407", "306", Boolean.TRUE, Boolean.FALSE);
          assertTrue(evenOrOddNumber != null);
          assertEquals(774, evenOrOddNumber.getDecimal_number());
          assertTrue("1100000110".equals(evenOrOddNumber.getBinary_number()));
          assertTrue("1407".equals(evenOrOddNumber.getOctal_number()));
          assertTrue("306".equals(evenOrOddNumber.getHex_number()));
          assertTrue(evenOrOddNumber.isEven);
          assertFalse(evenOrOddNumber.isOdd);
     }

     @Test
     public void testGetSetNumberClass ()
     {
          System.out.println("* Test of constructor of class Number *");
          Number digit = new Number();
          digit.setDecimal_number(775);
          digit.setBinary_number("1100000111");
          digit.setOctal_number("1408");
          digit.setHex_number("307");
          assertTrue(digit != null);
          assertEquals(775, digit.getDecimal_number());
          assertTrue("1100000111".equals(digit.getBinary_number()));
          assertTrue("1408".equals(digit.getOctal_number()));
          assertTrue("307".equals(digit.getHex_number()));

     }

     @Test
     public void testGetSetEvenOrOddClass ()
     {
          System.out.println("* Test of constructor of class Number *");
          EvenOrOddNumber evenOrOddNumber = new EvenOrOddNumber();
          evenOrOddNumber.setDecimal_number(775);
          evenOrOddNumber.setBinary_number("1100000111");
          evenOrOddNumber.setOctal_number("1408");
          evenOrOddNumber.setHex_number("307");
          evenOrOddNumber.setEven(775);
          evenOrOddNumber.setOdd(775);

          assertTrue(evenOrOddNumber != null);
          assertEquals(775, evenOrOddNumber.getDecimal_number());
          assertTrue("1100000111".equals(evenOrOddNumber.getBinary_number()));
          assertTrue("1408".equals(evenOrOddNumber.getOctal_number()));
          assertTrue("307".equals(evenOrOddNumber.getHex_number()));
          assertFalse(evenOrOddNumber.getEven());
          assertTrue(evenOrOddNumber.getOdd());
     }

     @Test
     public void testGetSetEvenOrOddClass1 ()
     {
          System.out.println("* Test of constructor of class Number *");
          EvenOrOddNumber evenOrOddNumber = new EvenOrOddNumber();
          evenOrOddNumber.setDecimal_number(774);
          evenOrOddNumber.setBinary_number("1100000110");
          evenOrOddNumber.setOctal_number("1407");
          evenOrOddNumber.setHex_number("306");
          evenOrOddNumber.setEven(774);
          evenOrOddNumber.setOdd(774);

          assertTrue(evenOrOddNumber != null);
          assertEquals(774, evenOrOddNumber.getDecimal_number());
          assertTrue("1100000110".equals(evenOrOddNumber.getBinary_number()));
          assertTrue("1407".equals(evenOrOddNumber.getOctal_number()));
          assertTrue("306".equals(evenOrOddNumber.getHex_number()));
          assertTrue(evenOrOddNumber.getEven());
          assertFalse(evenOrOddNumber.getOdd());

     }
}
