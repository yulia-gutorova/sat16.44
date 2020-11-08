package com.Gutorova.Yulia;

import java.util.Scanner;

class Digit
{
    private Integer decimal_number;
    private String binary_number;
    private String octal_number;
    private String hex_number;
    static Integer  error = 0, warning = 0;
    Integer counter = 0;

    
    public Digit(int decimal_number, String binary_number, String octal_number, String hex_number)
    {
        this.decimal_number = decimal_number;
        this.binary_number = binary_number;
        this.octal_number = octal_number;
        this.hex_number = hex_number;
    }

    public int getDecimal_number()
    {
        return decimal_number;
    }

    public  void  setDecimal_number(Integer decimal_number) { this.decimal_number = decimal_number; }

    public String getBinary_number()
    {
        return binary_number;
    }

    public void setBinary_number(String binary_number)
    {
        this.binary_number = binary_number;
    }

    public String getOctal_number()
    {
        return octal_number;
    }

    public void setOctal_number(String octal_number)
    {
        this.octal_number = octal_number;
    }

    public String getHex_number()
    {
        return hex_number;
    }

    public void setHex_number(String hex_number)
    {
        this.hex_number = hex_number;
    }

    /*@Override
    public String toString ()
    {
        return "The decimal number is  " + this.decimal_number + "\nThe  binary number is   " +
                this.binary_number + "\nThe octal number is   " + this.octal_number +
                "\nThe heximal number is  " + this.hex_number;
    }*/

    @Override
    public String toString() {
        return  "Digit{" +
                "decimal_number = "  + decimal_number +
                ", binary_number = " + binary_number  +
                ", octal_number = "  + octal_number   +
                ", hex_number = "    + hex_number      +
                '}';
    }
}
