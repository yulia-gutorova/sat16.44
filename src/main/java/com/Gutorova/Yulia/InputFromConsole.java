package com.Gutorova.Yulia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputFromConsole {

    public static List<String> listString = new ArrayList<>();

    public static List<String> inputFromConsoleToStringList (Scanner input)
    {
        //List<String> listString = new ArrayList<>();
        while (input.hasNext())
        {
            String str = input.next();
            if (str.equals("#")) break;
            else listString.add(str);
        }
        return listString;

    }// eng inputFromConsole
}//end InputFromConsole
