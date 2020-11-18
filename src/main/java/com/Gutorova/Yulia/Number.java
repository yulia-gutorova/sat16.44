package com.Gutorova.Yulia;

import java.util.Scanner;

class Number
{
    private Integer decimal_number;
    private String binary_number;
    private String octal_number;
    private String hex_number;

    public Number(int decimal_number, String binary_number, String octal_number, String hex_number)
    {
        this.decimal_number = decimal_number;
        this.binary_number = binary_number;
        this.octal_number = octal_number;
        this.hex_number = hex_number;
    }

    public Number() {}

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

    @Override
    public String toString() {
        return  getClass().getSimpleName() +
                " Digit{" +
                "decimal_number = "  + decimal_number +
                ", binary_number = " + binary_number  +
                ", octal_number = "  + octal_number   +
                ", hex_number = "    + hex_number      +
                '}';
    }
}
