package com.Gutorova.Yulia;

import org.junit.*;
import java.util.Scanner;
import static org.junit.Assert.*;

public class TestTryAgain {
    DecimalToHexadecimal hexa = new DecimalToHexadecimal();
    DecimalToBinery bin = new DecimalToBinery();
    DecimalToOctal oct = new DecimalToOctal();

    @BeforeClass
    public static void messBeforeClassTest()
    {
        System.out.println("----- My test of the program TryAgain -----\n");
    }

    @Before
    public void messBeforeTest()
    {
        System.out.println("----- New test -----" ) ;
    }

    @Test
    public void testDec_to_bin() throws Exception
    {

        System.out.println("*testDec_to_bin*");
        System.out.println("*The test of the method <dec_to_bin> to convert a decimal number to binary number*");
        assertTrue("Error in the method dec_to_bin","1100000111".equals(bin.convert(775)));
    }

    @Test
    public void testDec_to_oct() throws  Exception
    {
        System.out.println("*testDec_to_oct*");
        System.out.println("*The test of the method <dec_to_oct> to convert a decimal number to octal number*");
        assertTrue("Error in the method dec_to_oct","1407".equals(oct.convert(775)));
    }

    @Test
    public void testDec_to_hex() throws Exception
    {
        System.out.println("*testDec_to_hex*");
        System.out.println("*The test of the method <dec_to_hex> to convert a decimal number to hexadecimal number*");
        assertTrue("Error in the method dec_to_hex", "307".equals(hexa.convert(775)));
    }

    @Test
    public void testCorrectInput()
    {
        System.out.println("*testCorrectInput*");
        System.out.println("*The test of the method <hasNextInt()> if input data is a number*\n");
        Scanner testinp = new Scanner ("775");
        assertTrue(testinp.hasNextInt() == true);
    }

    @After
    public void MessAfterClass()
    {
        System.out.println("----- Test finished -----\n");
    }

    @AfterClass
    public static void MessAfter()
    {
        System.out.println("----- Out test of the program TryAgain finished -----");
    }
}

