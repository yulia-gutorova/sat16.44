package com.Gutorova.Yulia;

import org.junit.*;
import java.util.Scanner;
import static org.junit.Assert.*;

public class TestConvertMethods {

    DecimalToHexadecimal hexa = new DecimalToHexadecimal();
    DecimalToBinary bin = new DecimalToBinary();
    DecimalToOctal oct = new DecimalToOctal();
    InputFromConsole input = new InputFromConsole();

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
        System.out.println("*The test of the method <DecimalToBinary> to convert a decimal number to binary number*");
        assertTrue("Error in the method dec_to_bin","1100000111".equals(bin.convert(775)));
    }

    @Test
    public void testDec_to_oct() throws  Exception
    {
        System.out.println("*The test of the method <DecimalToOctal> to convert a decimal number to octal number*");
        assertTrue("Error in the method dec_to_oct","1407".equals(oct.convert(775)));
    }

    @Test
    public void testDec_to_hex() throws Exception
    {
        System.out.println("*The test of the method <DecimalToHexadecimal> to convert a decimal number to hexadecimal number*");
        assertTrue("Error in the method dec_to_hex", "307".equals(hexa.convert(775)));
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

