package com.Gutorova.Yulia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestOfInputAndOutput {


    InputFromConsole inputFromConsole = new InputFromConsole();
    ClearIntegerList clear = new ClearIntegerList();
    //Scanner scanner = new Scanner(s);
    List<String> fact = new ArrayList<>();

    @Test
    @DisplayName("Test of clear input")
    public  void  testOfClearInput()
    {
        List<String> testString = Stream.of("0", "1", "-1", "1000", "ghjg", "3.4", "^&", " ", "#").collect(Collectors.toList());

        Integer[] expectedList = {0, 1, 1000};
        List<Integer> expected = Arrays.asList(expectedList);


        List<Integer> testInt = clear.clearIntegerList(testString);
        Assertions.assertArrayEquals(expected.toArray(), testInt.toArray());
    }

    @Test
    @DisplayName("Test of input")
    public void TestOfAllDataInput()
    {

        List<String> testString = Arrays.asList("0", "1", "-1", "1000", "ghjg", "3.4", "^&", " ", "#");
        List <String> testExpected = Stream.of("0", "1", "-1", "1000", "ghjg", "3.4", "^&").collect(Collectors.toList());

        for (String element : testString)
        {
            Scanner scanner = new Scanner(element);
            fact = inputFromConsole.inputFromConsoleToStringList(scanner);
            scanner.close();
        }

        Assertions.assertArrayEquals(testExpected.toArray(), fact.toArray());
    }


}


