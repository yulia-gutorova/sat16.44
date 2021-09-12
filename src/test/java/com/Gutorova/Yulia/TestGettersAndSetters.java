package com.Gutorova.Yulia;

import org.junit.jupiter.api.*;

@Tag("unit")

public class TestGettersAndSetters {

     Number digit = new Number();

     @BeforeAll
     public static void messBeforeClass()
     {
         System.out.println("----------------- Test of constructors, getters ans setters----------------");
     }


     @Test
     @DisplayName("Number class constructor test")
     public void testConstructorNumberClass()
     {
          Number digit = new Number(1, "001","1","1");
          Assertions.assertTrue(digit != null);
          Assertions.assertEquals(1, digit.getDecimal_number());
          Assertions.assertTrue("001".equals(digit.getBinary_number()));
          Assertions.assertTrue("1".equals(digit.getOctal_number()));
          Assertions.assertTrue("1".equals(digit.getHex_number()));
     }

     @Test
     @DisplayName("EvenOrOddClass constructor test constructor test (even number)")
     public void testConstructorEvenOrOddClass()
     {
          EvenOrOddNumber evenOrOddNumber = new EvenOrOddNumber(775,"1100000111", "1408", "307", Boolean.FALSE, Boolean.TRUE);
          Assertions.assertTrue(evenOrOddNumber != null);
          Assertions.assertEquals(775, evenOrOddNumber.getDecimal_number());
          Assertions.assertTrue("1100000111".equals(evenOrOddNumber.getBinary_number()));
          Assertions.assertTrue("1408".equals(evenOrOddNumber.getOctal_number()));
          Assertions.assertTrue("307".equals(evenOrOddNumber.getHex_number()));
          Assertions.assertFalse(evenOrOddNumber.isEven);
          Assertions.assertTrue(evenOrOddNumber.isOdd);
     }

     @Test
     @DisplayName("EvenOrOddClass constructor test constructor test (odd number)")
     public void testConstructorEvenOrOddClass1()
     {
          System.out.println("* Test of constructor of class EvenOrOddClass with an odd number");
          EvenOrOddNumber evenOrOddNumber = new EvenOrOddNumber(774,"1100000110", "1407", "306", Boolean.TRUE, Boolean.FALSE);
          Assertions.assertTrue(evenOrOddNumber != null);
          Assertions.assertEquals(774, evenOrOddNumber.getDecimal_number());
          Assertions.assertTrue("1100000110".equals(evenOrOddNumber.getBinary_number()));
          Assertions.assertTrue("1407".equals(evenOrOddNumber.getOctal_number()));
          Assertions.assertTrue("306".equals(evenOrOddNumber.getHex_number()));
          Assertions.assertTrue(evenOrOddNumber.isEven);
          Assertions.assertFalse(evenOrOddNumber.isOdd);
     }

     @Test
     @DisplayName("Number class getters and setters test")
     public void testGetSetNumberClass ()
     {
          Number digit = new Number();
          digit.setDecimal_number(775);
          digit.setBinary_number("1100000111");
          digit.setOctal_number("1408");
          digit.setHex_number("307");
          Assertions.assertTrue(digit != null);
          Assertions.assertEquals(775, digit.getDecimal_number());
          Assertions.assertTrue("1100000111".equals(digit.getBinary_number()));
          Assertions.assertTrue("1408".equals(digit.getOctal_number()));
          Assertions.assertTrue("307".equals(digit.getHex_number()));

     }

     @Test
     @DisplayName("EvenOrOddClass getters and setters test (even number)")
     public void testGetSetEvenOrOddClass ()
     {
          EvenOrOddNumber evenOrOddNumber = new EvenOrOddNumber();
          evenOrOddNumber.setDecimal_number(775);
          evenOrOddNumber.setBinary_number("1100000111");
          evenOrOddNumber.setOctal_number("1408");
          evenOrOddNumber.setHex_number("307");
          evenOrOddNumber.setEven(775);
          evenOrOddNumber.setOdd(775);

          Assertions.assertTrue(evenOrOddNumber != null);
          Assertions.assertEquals(775, evenOrOddNumber.getDecimal_number());
          Assertions.assertTrue("1100000111".equals(evenOrOddNumber.getBinary_number()));
          Assertions.assertTrue("1408".equals(evenOrOddNumber.getOctal_number()));
          Assertions.assertTrue("307".equals(evenOrOddNumber.getHex_number()));
          Assertions.assertFalse(evenOrOddNumber.getEven());
          Assertions.assertTrue(evenOrOddNumber.getOdd());
     }

     @Test
     @DisplayName("EvenOrOddClass getters and setters test (odd number)")
     public void testGetSetEvenOrOddClass1 ()
     {
          EvenOrOddNumber evenOrOddNumber = new EvenOrOddNumber();
          evenOrOddNumber.setDecimal_number(774);
          evenOrOddNumber.setBinary_number("1100000110");
          evenOrOddNumber.setOctal_number("1407");
          evenOrOddNumber.setHex_number("306");
          evenOrOddNumber.setEven(774);
          evenOrOddNumber.setOdd(774);

          Assertions.assertTrue(evenOrOddNumber != null);
          Assertions.assertEquals(774, evenOrOddNumber.getDecimal_number());
          Assertions.assertTrue("1100000110".equals(evenOrOddNumber.getBinary_number()));
          Assertions.assertTrue("1407".equals(evenOrOddNumber.getOctal_number()));
          Assertions.assertTrue("306".equals(evenOrOddNumber.getHex_number()));
          Assertions.assertTrue(evenOrOddNumber.getEven());
          Assertions.assertFalse(evenOrOddNumber.getOdd());

     }
}
