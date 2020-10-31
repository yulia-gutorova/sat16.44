package com.Gutorova.Yulia;

public class Methods {

//Method decimal number --> binary number
    static String dec_to_bin(int n)
    {
        int bin_code;
        String bin_number = "", bin_number_revers = "";
        while (n != 0)
        {
            bin_code = n % 2;
            n = n / 2;
            bin_number = bin_number + Integer.toString(bin_code);
        }
        bin_number_revers = new StringBuffer(bin_number).reverse().toString();
        return bin_number_revers;
    }
//--------------------------------------------

//decimal number --> octal number
    static String dec_to_oct (int k)
    {
        int oct_code;
        String oct_number = "", oct_number_revers = "";
        while(k != 0)
        {
            oct_code = k % 8;
            k = k / 8;
            oct_number = oct_number + Integer.toString(oct_code);
        }
        oct_number_revers = new StringBuffer(oct_number).reverse().toString();
        return oct_number_revers;
    }
//--------------------------------------------

//decimal number --> hexadecimal number
    static String dec_to_hex (int l)
    {
        int hex_code;
        String hex_number = "", hex_number_revers = "";
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(l != 0)
        {
            hex_code = l % 16;
            l = l / 16;
            hex_number = hex_number + hex[hex_code];
        }
        hex_number_revers = new StringBuffer(hex_number).reverse().toString();
        return hex_number_revers;
    }
//--------------------------------------------

//Method binary digit --> decimal digit
    static int bit_to_dec(int m)
    {
        int flag, degree = 0, dec_number = 0;
        while (m != 0)
        {
            flag = m % 10;
            dec_number = dec_number + flag * (int) Math.pow(2, degree);
            degree++;
            m = m / 10;
        }
        return dec_number;
    }
//--------------------------------------------

}
