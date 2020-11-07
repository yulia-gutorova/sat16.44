package com.Gutorova.Yulia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import java.io.*;
import java.util.stream.Collectors;

public class TryAgain

{
    static final String RESET = "\u001b[0m";
    static final String RED = "\u001b[32m";
    static final String GREEN = "\u001b[31m";
    static final String YELLOW = "\u001b[33m";
    static final String BLUE = "\u001b[34m";
    static final String PURPLE = "\u001b[35m";
    static final String CYAN = "\u001b[36m";

    public static void main(String[] args) throws IOException {
        int count = 0;
        //Boolean bol = true;
        Digit digit = new Digit(0, "0", "0", "0");
        List<Digit> listDigit = new ArrayList<>();
        DecimalToHexadecimal hexa = new DecimalToHexadecimal();
        DecimalToBinary bin = new DecimalToBinary();
        DecimalToOctal oct = new DecimalToOctal();

        Scanner inp = new Scanner(System.in);

        System.out.print("Input a positive decimal number  ");

        while (true )
        {
            if (inp.hasNextInt())
            {

                digit.setDecimal_number(inp);

                if (Digit.error == 0)
                {
                    digit.setBinary_number(bin.convert(digit.getDecimal_number()));
                    digit.setOctal_number(oct.convert(digit.getDecimal_number()));
                    digit.setHex_number(hexa.convert(digit.getDecimal_number()));

                    listDigit.add(new Digit(digit.getDecimal_number(), digit.getBinary_number(),digit.getOctal_number(), digit.getHex_number()));
                    count ++;
                }

            }
        else break;
        } //end of while

        /* // Example of print with help of for:
        for (Digit d : listDigit)
            System.out.println(d.getDecimal_number() + "\n" + d.getBinary_number() + "\n" + d.getOctal_number() + "\n" + d.getHex_number());
        System.out.println("the program is finished");*/
        List <Digit> evenNumbers = listDigit.stream().filter(dig -> dig.getDecimal_number()%2 == 0 ).collect(Collectors.toList());
        List <Digit> oddNumbers = listDigit.stream().filter(dig -> dig.getDecimal_number()%2 != 0 ).collect(Collectors.toList());

        WriteToConsol writeToConsol = new WriteToConsol();

        writeToConsol.writeToConsol(listDigit, "");
        writeToConsol.writeToConsol(evenNumbers, "even");
        writeToConsol.writeToConsol(oddNumbers, "odd");


        WriteToFile writeToFile = new WriteToFile();

        writeToFile.writeToFile("C:\\Users\\Yulia\\IdeaProjects\\sat16.44\\even.txt", evenNumbers, "even");
        writeToFile.writeToFile("C:\\Users\\Yulia\\IdeaProjects\\sat16.44\\odd.txt", oddNumbers, "odd");

    }//end of main
}// end of Tryagain





