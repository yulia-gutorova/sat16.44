package com.Gutorova.Yulia;

public class EvenOrOddNumber extends Number {

    Boolean isEven;
    Boolean isOdd;

    public EvenOrOddNumber(int decimal_number, String binary_number, String octal_number, String hex_number, Boolean isEven, Boolean isOdd) {
        super(decimal_number, binary_number, octal_number, hex_number);
        this.isEven = isEven;
        this.isOdd = isOdd;
    }

    public Boolean getEven() {
        return isEven;
    }

    public void setEven( int d) {
        if  (d%2 == 0) {isEven = Boolean.TRUE; isOdd = Boolean.FALSE;}
        else {isEven = Boolean.FALSE; isOdd = Boolean.TRUE;}
    }

    public Boolean getOdd() {
        return isOdd;
    }

    public void setOdd(int d) {
        if  (d%2 == 0) {isOdd = Boolean.FALSE;}
        else {isOdd = Boolean.TRUE;}
    }

    @Override
    public String toString() {
        return  "EvenOrOddNumber{" +
                "decimal number = " + getDecimal_number()   +
                ", binary number = " + getBinary_number()   +
                ", octal nunber = " + getOctal_number()     +
                ", hexadecimal number = " + getHex_number() +
                ", isEven = " + isEven +
                ", isOdd = " + isOdd +
                '}';
    }
}
