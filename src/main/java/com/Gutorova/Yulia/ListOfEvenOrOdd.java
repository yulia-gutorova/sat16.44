package com.Gutorova.Yulia;

import java.util.ArrayList;
import java.util.List;

public class ListOfEvenOrOdd {

    public static List<EvenOrOddNumber> listOfEvenOrOdd (List <Integer> list)

    {
        List <EvenOrOddNumber> listEvenOrOdd = new ArrayList<>();
        EvenOrOddNumber e = new EvenOrOddNumber(0,"0","0","0",true, false);
        DecimalToHexadecimal hexa = new DecimalToHexadecimal();
        DecimalToBinary bin = new DecimalToBinary();
        DecimalToOctal oct = new DecimalToOctal();

        for (int number : list)
        {
            e.setDecimal_number(number);
            e.setBinary_number(bin.convert(e.getDecimal_number()));
            e.setOctal_number(oct.convert(e.getDecimal_number()));
            e.setHex_number(hexa.convert(e.getDecimal_number()));
            e.setEven(number);
            e.setOdd(number);
            listEvenOrOdd.add(new EvenOrOddNumber(e.getDecimal_number(), e.getBinary_number(),e.getOctal_number(), e.getHex_number(), e.getEven(), e.getOdd()));
        }

        return listEvenOrOdd;
    }
}
