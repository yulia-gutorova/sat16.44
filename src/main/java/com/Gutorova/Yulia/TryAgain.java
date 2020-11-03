package com.Gutorova.Yulia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import java.io.*;

public class TryAgain
{

    public static void main(String[] args) {
        int count = 0;
        //Boolean bol = true;
        Digit digit = new Digit(0, "0", "0", "0");
        List<Digit> listDigit = new ArrayList<>();
        DecimalToHexadecimal hexa = new DecimalToHexadecimal();
        DecimalToBinary bin = new DecimalToBinary();
        DecimalToOctal oct = new DecimalToOctal();

        Scanner inp = new Scanner(System.in);

        System.out.print("Input a positive decimal number  ");

        while (true ) {
            if (inp.hasNextInt())
            {

                digit.setDecimal_number(inp);

                if (Digit.error == 0)
                {
                    digit.setBinary_number(bin.convert(digit.getDecimal_number()));
                    digit.setOctal_number(oct.convert(digit.getDecimal_number()));
                    digit.setHex_number(hexa.convert(digit.getDecimal_number()));

                    listDigit.add(new Digit(digit.getDecimal_number(), digit.getBinary_number(),digit.getOctal_number(), digit.getHex_number() ));
                    count ++;
                    //System.out.println("\nThe decimal number is " + digit.getDecimal_number() + "\nThe binary number is " +
                    //        digit.getBinary_number() + "\nThe octal number is " + digit.getOctal_number() + "\nThe hexsimal number is " + digit.getHex_number());
                }

           // System.out.println("\nTry to print list\n");

            //for (int i = 0; i < listDigit.size(); i++) System.out.println(listDigit.get(i).getClass().getName().isEmpty());*/
            }

            else break;
        }
        for (Digit d : listDigit)
            System.out.println(d.getDecimal_number() + "\n" + d.getBinary_number() + "\n" + d.getOctal_number() + "\n" + d.getHex_number());
        System.out.println("the program is finished");

    }//end of main
}// end of Tryagain





