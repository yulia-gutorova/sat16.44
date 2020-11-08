package com.Gutorova.Yulia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import java.io.*;
import java.util.stream.Collectors;

public class TryAgain

{
    static final String RESET = "\u001b[0m";
    static final String RED = "\u001b[32m";
    static final String GREEN = "\u001b[31m";
    static final String YELLOW = "\u001b[33m";
    static final String BLUE = "\u001b[34m";
    static final String PURPLE = "\u001b[35m";
    static final String CYAN = "\u001b[36m";

    public static void main(String[] args) throws IOException {

        List<Digit> listDigit = new ArrayList<>();
        List<Integer> listOfPositiveIntegerNumbers = new ArrayList<>();


        listOfPositiveIntegerNumbers = InputFromConsole.inputFromConsole();

        System.out.println("listOfPositiveIntegerNumbers");
        listOfPositiveIntegerNumbers.stream().forEach(in -> System.out.println(in));

        listDigit = ListOfDigit.listOfDigit(listOfPositiveIntegerNumbers);
        List <Digit> evenNumbers = listDigit.stream().filter(dig -> dig.getDecimal_number()%2 == 0 ).collect(Collectors.toList());
        List <Digit> oddNumbers = listDigit.stream().filter(dig -> dig.getDecimal_number()%2 != 0 ).collect(Collectors.toList());

        WriteToConsol writeToConsol = new WriteToConsol();

        writeToConsol.writeToConsol(listDigit, "");
        writeToConsol.writeToConsol(evenNumbers, "even");
        writeToConsol.writeToConsol(oddNumbers, "odd");

        WriteToFile writeToFile = new WriteToFile();

        writeToFile.writeToFile("C:\\Users\\Yulia\\IdeaProjects\\sat16.44\\even.txt", evenNumbers, "even");
        writeToFile.writeToFile("C:\\Users\\Yulia\\IdeaProjects\\sat16.44\\odd.txt", oddNumbers, "odd");

    }//end of main
}// end of Tryagain





