package com.Gutorova.Yulia;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class TestofInputAndOutput {

    InputFromConsole inputFromConsole = new InputFromConsole();
    //Scanner scanner = new Scanner(s);
    List<String> fact = new ArrayList<>();

    @Test
    public  void  testOfClearInput()
    {
        List<String> testString = List.of ("0", "1", "-1", "1000", "ghjg", "3.4", "^&", " ", "#");
        List<Integer> expected = List.of (0, 1, 1000);
        List <Integer> testInt = ClearIntegerList.clearIntegerList(testString);
        assertArrayEquals(expected.toArray(), testInt.toArray());
    }

    @Test
    public void TestOfAllDataInput () throws FileNotFoundException {
        List<String> testString = List.of ("0", "1", "-1", "1000", "ghjg", "3.4", "^&", " ", "#");
        List <String> testExpected = List.of ("0", "1", "-1", "1000", "ghjg", "3.4", "^&");
        for (String element : testString)
        {
            Scanner scanner = new Scanner(element);
            fact = inputFromConsole.inputFromConsoleToStringList( scanner);
        }
        assertArrayEquals(testExpected.toArray(), fact.toArray());
    }

}
