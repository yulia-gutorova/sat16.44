package com.Gutorova.Yulia;

public class DecimalToHexadecimal implements Interface {
     public String convert (int x)
    {
        int hex_code;
        String hex_number = "", hex_number_revers = "";
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(x != 0)
        {
            hex_code = x % 16;
            x = x / 16;
            hex_number = hex_number + hex[hex_code];
        }
        hex_number_revers = new StringBuffer(hex_number).reverse().toString();
        return hex_number_revers;
    }
}
