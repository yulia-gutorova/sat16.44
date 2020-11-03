package com.Gutorova.Yulia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import java.io.*;

public class TryAgain
{

    public static void main(String[] args) {

        Digit D = new Digit(0, "0", "0", "0");
        List<Digit> listDigit = new ArrayList<>();
        DecimalToHexadecimal hexa = new DecimalToHexadecimal();
        DecimalToBinary bin = new DecimalToBinary();
        DecimalToOctal oct = new DecimalToOctal();

        Scanner inp = new Scanner(System.in);
        System.out.print("Input a positive decimal number  ");


        D.setDecimal_number(inp);

    if (Digit.warning == 0 && Digit.error == 0 )
    {
        D.setBinary_number(bin.convert(D.getDecimal_number()));
        D.setOctal_number(oct.convert(D.getDecimal_number()));
        D.setHex_number(hexa.convert(D.getDecimal_number()));

        listDigit.add(D);

       /* System.out.println("\nThe decimal number is " + D.getDecimal_number() + "\nThe binary number is " +
                D.getBinary_number() + "\nThe octal number is " + D.getOctal_number() + "\nThe hexsimal number is " + D.getHex_number());*/
    }

        System.out.println("\nTry to print list\n");
        for (Digit d : listDigit)
            System.out.println(d.getDecimal_number() + "\n" + d.getBinary_number() + "\n" + d.getOctal_number() + "\n" + d.getHex_number());

        //for (int i = 0; i < listDigit.size(); i++) System.out.println(listDigit.get(i).getClass().getName().isEmpty());

    }
}





