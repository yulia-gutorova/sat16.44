package com.Gutorova.Yulia;

public class DecimalToBinary implements Interface {

        public String convert (Integer x)
        {
            Integer  bin_code;
            String bin_number = "", bin_number_revers = "";
            while (x != 0)
            {
                bin_code = x % 2;
                x = x / 2;
                bin_number = bin_number + Integer.toString(bin_code);
            }
            bin_number_revers = new StringBuffer(bin_number).reverse().toString();
            return bin_number_revers;
        }
}
