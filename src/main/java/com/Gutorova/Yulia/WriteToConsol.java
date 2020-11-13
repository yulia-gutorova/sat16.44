package com.Gutorova.Yulia;

import java.util.List;

public class WriteToConsol {
    public <T> void writeToConsol (List<T> list, String str){

        System.out.println("\n\nCount of " + str + " numbers: "   + list.size() + "\n");
        list.stream().forEach(System.out::println);

    }
}
