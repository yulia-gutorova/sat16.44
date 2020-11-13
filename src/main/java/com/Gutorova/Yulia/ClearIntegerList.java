package com.Gutorova.Yulia;

import java.util.ArrayList;
import java.util.List;

public class ClearIntegerList {

    public static List<Integer> clearIntegerList (List<String> s)

    {
        List<Integer> listInteger = new ArrayList<>();
        List<String> listTrash = new ArrayList<>();
        String warning = "";

        for (int i = 0; i < s.size(); i++)
        {
            try
            {
                Integer j = Integer.parseInt(s.get(i));

                if (j >= 0)
                {
                    listInteger.add(j);
                    warning = "Positive number";
                }
                else
                {
                    listTrash.add(Integer.toString(j));
                    warning = "Negative number";
                }
            } catch (NumberFormatException var6) {
                listTrash.add(s.get(i));
                warning = "NaN";
            }
        }// end for

        return listInteger;
    }
}
