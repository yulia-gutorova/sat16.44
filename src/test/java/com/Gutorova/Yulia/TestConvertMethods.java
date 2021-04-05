package com.Gutorova.Yulia;


import org.junit.jupiter.api.*;

@Tag("unit")

public class TestConvertMethods {

    DecimalToHexadecimal hexa = new DecimalToHexadecimal();
    DecimalToBinary bin = new DecimalToBinary();
    DecimalToOctal oct = new DecimalToOctal();
    InputFromConsole input = new InputFromConsole();

    @BeforeAll
    public static void messBeforeClassTest()
    {
        System.out.println("----- My first unit tests of the program TryAgain -----\n");
    }

    @BeforeEach
    public void messBeforeTest()
    {
        System.out.println("----- New test -----" ) ;
    }

    @Test
    @DisplayName("Convert decimal numbers to binary numbers")
    public void testDec_to_bin() throws Exception
    {
        Assertions.assertTrue("1100000111".equals(bin.convert(775)),"Error in the method dec_to_bin");
    }

    @Test
    @DisplayName("Convert decimal numbers to an octal numbers")
    public void testDec_to_oct() throws  Exception
    {
        Assertions.assertTrue("1407".equals(oct.convert(775)), "Error in the method dec_to_oct");
    }

    @Test
    @DisplayName("Convert decimal numbers to hexadecimal numbers")
    public void testDec_to_hex() throws Exception
    {
        Assertions.assertTrue("307".equals(hexa.convert(775)), "Error in the method dec_to_hex");
    }


    @AfterEach
    public void MessAfterClass()
    {
        System.out.println("----- Test finished -----\n");
    }

    @AfterAll
    public static void MessAfter()
    {
        System.out.println("----- Finish of unit tests -----");
    }
}

