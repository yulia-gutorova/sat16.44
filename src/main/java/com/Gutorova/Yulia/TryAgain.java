package com.Gutorova.Yulia;

import java.util.ArrayList;
import java.util.List;

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
        List <String> listOfAllInputVariables = new ArrayList<>();
        List<Integer> listOfPositiveIntegerNumbers = new ArrayList<>();
        List <EvenOrOddNumber> evenOrOddNumbers = new ArrayList<>();

// cal the method inputFromConsoleToStringList to write all input variables from console to a list of type String

        listOfAllInputVariables = InputFromConsole.inputFromConsoleToStringList();
//---------------------------------------------------------------------------------------

// call the method clearIntegerList to create a list of positive integer nimbers
        listOfPositiveIntegerNumbers = ClearIntegerList.clearIntegerList(listOfAllInputVariables);
//---------------------------------------------------------------------------------------

        System.out.println("listOfPositiveIntegerNumbers");
        listOfPositiveIntegerNumbers.stream().forEach(in -> System.out.println(in));

// call the method listOfDigit to create a list that consists of elements of type Digit
        listDigit = ListOfDigit.listOfDigit(listOfPositiveIntegerNumbers);
//---------------------------------------------------------------------------------------

//call the method listOfEvenOrOdd to create a list that consists of elements of type EvenOrOddNumber
        evenOrOddNumbers = ListOfEvenOrOdd.listOfEvenOrOdd(listOfPositiveIntegerNumbers);
//---------------------------------------------------------------------------------------

// stream to create a list of even numbers and a list of odd numbers
        List <Digit> evenNumbers = listDigit.stream().filter(dig -> dig.getDecimal_number()%2 == 0 ).collect(Collectors.toList());
        List <Digit> oddNumbers = listDigit.stream().filter(dig -> dig.getDecimal_number()%2 != 0 ).collect(Collectors.toList());

//---------------------------------------------------------------------------------------

//cal the method writeToConsol to write the lists to console
        WriteToConsole writeToConsol = new WriteToConsole();

        writeToConsol.writeToConsole(listDigit, "");
        writeToConsol.writeToConsole(evenNumbers, "even");
        writeToConsol.writeToConsole(oddNumbers, "odd");
        writeToConsol.writeToConsole(evenOrOddNumbers, "Even or odd numbers");
//---------------------------------------------------------------------------------------

//call the method WriteToFile to write the lists to files
        WriteToFile writeToFile = new WriteToFile();

        writeToFile.writeToFile("C:\\Users\\Yulia\\IdeaProjects\\sat16.44\\even.txt", evenNumbers, "even");
        writeToFile.writeToFile("C:\\Users\\Yulia\\IdeaProjects\\sat16.44\\odd.txt", oddNumbers, "odd");
        writeToFile.writeToFile("C:\\Users\\Yulia\\IdeaProjects\\sat16.44\\even_odd.txt", evenOrOddNumbers, "even or odd numbers");
//---------------------------------------------------------------------------------------


       // writeToFile.writeToFile("C:\\Users\\Yulia\\IdeaProjects\\sat16.44\\even.txt", evenOrOddNumbers, "even or odd");

        /*for (Digit element : listDigit) {
            evenOrOdd.setDecimal_number(element.getDecimal_number());
            evenOrOdd.setBinary_number(element.getBinary_number());
            evenOrOdd.setOctal_number(element.getOctal_number());
            evenOrOdd.setOctal_number(element.getOctal_number());
            evenOrOdd.setEven(element.getDecimal_number());
            evenOrOdd.setOdd(element.getDecimal_number());
            evenOrOddNumbers.add(new EvenOrOddNumber(evenOrOdd.getDecimal_number(), evenOrOdd.getBinary_number(), evenOrOdd.getOctal_number(), evenOrOdd.getHex_number(), evenOrOdd.getEven(), evenOrOdd.getOdd()));
        }*/


        //evenOrOddNumbers.stream().forEach(e -> System.out.println(e));



    }//end of main
}// end of Tryagain





