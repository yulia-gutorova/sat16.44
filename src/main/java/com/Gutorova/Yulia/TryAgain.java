package com.Gutorova.Yulia;

import java.util.ArrayList;
import java.util.List;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TryAgain

{
    static final String RESET = "\u001b[0m";
    static final String RED = "\u001b[31m";
    static final String GREEN = "\u001b[32m";
    static final String YELLOW = "\u001b[33m";
    static final String BLUE = "\u001b[34m";
    static final String PURPLE = "\u001b[35m";
    static final String CYAN = "\u001b[36m";

    public static void main(String[] args) throws IOException {

       // List<String> listString = new ArrayList<>();
        ClearIntegerList clear = new ClearIntegerList();
        List<Number> listDigit = new ArrayList<>();
        List <String> listOfAllInputVariables = new ArrayList<>();
        List<Integer> listOfPositiveIntegerNumbers = new ArrayList<>();
        List <EvenOrOddNumber> evenOrOddNumbers = new ArrayList<>();

// cal the method inputFromConsoleToStringList to write all input variables from console to a list of type String
        Scanner inp = new Scanner(System.in);

        System.out.println(BLUE + "Write some numbers, finish input with #" + RESET);
        listOfAllInputVariables = InputFromConsole.inputFromConsoleToStringList(inp);
        System.out.println(YELLOW + "List of all input data: listString" + RESET);
        listOfAllInputVariables.stream().forEach(System.out::println);

        inp.close();
//---------------------------------------------------------------------------------------

// call the method clearIntegerList to create a list of positive integer numbers
        listOfPositiveIntegerNumbers = clear.clearIntegerList(listOfAllInputVariables);

        System.out.println(YELLOW + "List of positive integer numbers (clear input data): listOfPositiveIntegerNumbers" +  RESET);
        listOfPositiveIntegerNumbers.stream().forEach(in -> System.out.println(in));

// call the method listOfDigit to create a list that consists of elements of type Digit
        listDigit = ListOfNumbers.listOfDigit(listOfPositiveIntegerNumbers);
//---------------------------------------------------------------------------------------

//call the method listOfEvenOrOdd to create a list that consists of elements of type EvenOrOddNumber
        evenOrOddNumbers = ListOfEvenOrOdd.listOfEvenOrOdd(listOfPositiveIntegerNumbers);
//---------------------------------------------------------------------------------------

// stream to create a list of even numbers and a list of odd numbers
        List <Number> evenNumbers = listDigit.stream().filter(dig -> dig.getDecimal_number()%2 == 0 ).collect(Collectors.toList());
        List <Number> oddNumbers = listDigit.stream().filter(dig -> dig.getDecimal_number()%2 != 0 ).collect(Collectors.toList());

        // another way

        List <EvenOrOddNumber> evenNumbers1 = evenOrOddNumbers.stream().filter(e -> e.isEven).collect(Collectors.toList());
        List <EvenOrOddNumber> oddNumbers1 = evenOrOddNumbers.stream().filter(e -> e.isOdd).collect(Collectors.toList());
//---------------------------------------------------------------------------------------

//cal the method writeToConsol to write the lists to console
        WriteToConsole writeToConsol = new WriteToConsole();

        writeToConsol.writeToConsole(listDigit, "");
        writeToConsol.writeToConsole(evenNumbers, "even");
        writeToConsol.writeToConsole(oddNumbers, "odd");
        writeToConsol.writeToConsole(evenOrOddNumbers, "Even or odd numbers");

        System.out.println(PURPLE + "\nAnother way to create a list of even numbers" + RESET);
        writeToConsol.writeToConsole(evenNumbers1, "even");
        System.out.println(PURPLE + "\nAnother way to create a list of even numbers" + RESET);
        writeToConsol.writeToConsole(oddNumbers1, "odd" );
//---------------------------------------------------------------------------------------

//call the method WriteToFile to write the lists to files
        WriteToFile writeToFile = new WriteToFile();

        writeToFile.writeToFile("C:\\Users\\Yulia\\IdeaProjects\\sat16.44\\even.txt", evenNumbers, "even");
        writeToFile.writeToFile("C:\\Users\\Yulia\\IdeaProjects\\sat16.44\\odd.txt", oddNumbers, "odd");
        writeToFile.writeToFile("C:\\Users\\Yulia\\IdeaProjects\\sat16.44\\even_odd.txt", evenOrOddNumbers, "even or odd numbers");
//---------------------------------------------------------------------------------------


    }//end of main
}// end of TryAgain





