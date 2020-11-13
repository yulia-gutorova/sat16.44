package com.Gutorova.Yulia;

import java.util.ArrayList;
import java.util.List;

public class ListOfDigit {

    public static List<Digit> listOfDigit (List <Integer> list)

    {
        List <Digit> listD = new ArrayList<>();
        Digit d = new Digit(0, "0", "0", "0");
        DecimalToHexadecimal hexa = new DecimalToHexadecimal();
        DecimalToBinary bin = new DecimalToBinary();
        DecimalToOctal oct = new DecimalToOctal();

        for (int number : list)
        {
            d.setDecimal_number(number);
            d.setBinary_number(bin.convert(d.getDecimal_number()));
            d.setOctal_number(oct.convert(d.getDecimal_number()));
            d.setHex_number(hexa.convert(d.getDecimal_number()));
            listD.add(new Digit(d.getDecimal_number(), d.getBinary_number(),d.getOctal_number(), d.getHex_number()));
        }

        return listD;
    }
}
