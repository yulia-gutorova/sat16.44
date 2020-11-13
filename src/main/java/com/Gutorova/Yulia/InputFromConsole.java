package com.Gutorova.Yulia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputFromConsole {

    public static List<String> inputFromConsoleToStringList()

    {
        List<String> listString = new ArrayList<>();

        String warning = "";

        System.out.println("Write some numbers, finish input with #");
        Scanner input = new Scanner(System.in);

        while (input.hasNext())
        {
            String str = input.next();
            if (str.equals("#")) break;
            else listString.add(str);
        }
        System.out.println("listString");

        listString.stream().forEach(System.out::println);
        return listString;


    }// eng inputFromConsole
}//end InputFromConsole
