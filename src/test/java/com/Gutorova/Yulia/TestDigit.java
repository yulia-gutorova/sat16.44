package com.Gutorova.Yulia;

import org.junit.*;
import java.util.Scanner;
import static org.junit.Assert.*;

public class TestDigit {

     Digit digit = new Digit(-5, "","","");
     Scanner scanner = new Scanner("-5");

     @BeforeClass
     public static void messBeforeClass()
     {
         System.out.println("----------------- Test of Digit class ----------------");
     }

     @Test
     public void testNegativeInput()
     {
         Scanner scanner = new Scanner("-5");
         digit.setDecimal_number(scanner);
         assertEquals((Integer) 1, Digit.error);
         //assertEquals(1, Digit.error );
     }

     @Test
    public void TestStringInput()
     {
         Scanner scanner = new Scanner("hgf");
         digit.setDecimal_number(scanner);
         assertEquals((Integer) 1, Digit.warning);
     }

     @Test
    public void  testRightInput()
     {
         Scanner scanner = new Scanner("5");
         digit.setDecimal_number(scanner);
         assertEquals((Integer) 0, Digit.error);
         assertEquals((Integer) 0, Digit.warning);
     }

}
