package com.Gutorova.Yulia;

import java.util.ArrayList;
import java.util.List;

public class ClearIntegerList {

    public  List<Integer> clearIntegerList (List<String> s)
    {
        List<Integer> listInteger = new ArrayList<>();
        List<String> listTrash = new ArrayList<>();

        for (int i = 0; i < s.size(); i++)
        {
            try
            {
                Integer j = Integer.parseInt(s.get(i));
                if (j >= 0)
                {
                    listInteger.add(j);
                }
                else
                {
                    listTrash.add(Integer.toString(j));
                }
            } catch (NumberFormatException var6) {
                listTrash.add(s.get(i));
            }
        }// end for
        return listInteger;
    }
}
