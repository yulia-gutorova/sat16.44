package com.Gutorova.Yulia;

import java.util.Scanner;

import java.io.*;

public class TryAgain
{

    public static void main(String[] args) {
        Digit D = new Digit(0, "0", "0", "0");

        Scanner inp = new Scanner(System.in);
        System.out.print("Input a positive decimal number  ");

        D.setDecimal_number(inp);

    if (Digit.warning == 0 && Digit.error == 0 ) {
        D.setBinary_number(Methods.dec_to_bin(D.getDecimal_number()));
        D.setOctal_number(Methods.dec_to_oct(D.getDecimal_number()));
        D.setHex_number(Methods.dec_to_hex(D.getDecimal_number()));
        System.out.println(D);
    }


    }
}





