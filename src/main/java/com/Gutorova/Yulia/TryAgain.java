package com.Gutorova.Yulia;

import java.util.Scanner;

import java.io.*;

public class TryAgain
{

    public static void main(String[] args) {
        Digit D = new Digit(0, "0", "0", "0");

        Scanner inp = new Scanner(System.in);
        System.out.print("Input a positive decimal number  ");
        DecimalToHexadecimal hexa = new DecimalToHexadecimal();
        DecimalToBinary bin = new DecimalToBinary();
        DecimalToOctal oct = new DecimalToOctal();

        D.setDecimal_number(inp);

    if (Digit.warning == 0 && Digit.error == 0 )
    {
        D.setBinary_number(bin.convert(D.getDecimal_number()));
        D.setOctal_number(oct.convert(D.getDecimal_number()));
        D.setHex_number(hexa.convert(D.getDecimal_number()));
        System.out.println(D);
    }


    }
}





