package com.Gutorova.Yulia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputFromConsole {

    public static List<Integer> inputFromConsole ()

    {
        List<String> listString = new ArrayList<>();
        List<Integer> listInteger = new ArrayList<>();
        List<String> listTrash = new ArrayList<>();
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

        for (int i = 0; i < listString.size(); i++)
        {
            try
            {
                Integer j = Integer.parseInt(listString.get(i));

                if (j >= 0)
                {
                    listInteger.add(j);
                    warning = "Positiv number";
                }
                else
                {
                    listTrash.add(Integer.toString(j));
                    warning = "Negative number";
                }
            } catch (NumberFormatException var6) {

                listTrash.add(listString.get(i));
                warning = "NaN";
            }
        }// end for

        return listInteger;

    }// eng inputFromConsole
}//end InputFromConsole
