package com.Gutorova.Yulia;

public class DecimalToOctal implements Interface{
    public String convert (Integer x)
    {
        Integer oct_code;
        String oct_number = "", oct_number_revers = "";
        while(x != 0)
        {
            oct_code = x % 8;
            x = x / 8;
            oct_number = oct_number + Integer.toString(oct_code);
        }
        oct_number_revers = new StringBuffer(oct_number).reverse().toString();
        return oct_number_revers;
    }
}
