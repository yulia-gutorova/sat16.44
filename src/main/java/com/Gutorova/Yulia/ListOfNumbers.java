package com.Gutorova.Yulia;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {

    public static List<Number> listOfDigit (List <Integer> list)

    {
        List <Number> listD = new ArrayList<>();
        Number d = new Number(0, "0", "0", "0");
        DecimalToHexadecimal hexa = new DecimalToHexadecimal();
        DecimalToBinary bin = new DecimalToBinary();
        DecimalToOctal oct = new DecimalToOctal();

        for (int number : list)
        {
            d.setDecimal_number(number);
            d.setBinary_number(bin.convert(d.getDecimal_number()));
            d.setOctal_number(oct.convert(d.getDecimal_number()));
            d.setHex_number(hexa.convert(d.getDecimal_number()));
            listD.add(new Number(d.getDecimal_number(), d.getBinary_number(),d.getOctal_number(), d.getHex_number()));
        }

        return listD;
    }
}
