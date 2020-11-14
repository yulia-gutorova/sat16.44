package com.Gutorova.Yulia;

import java.util.List;

public class WriteToConsole {
    public <T> void writeToConsole(List<T> list, String str){
        System.out.println(TryAgain.RED + "\nCount of " + str + " numbers: " + list.size() + "\n" + TryAgain.RESET );
        list.stream().forEach(System.out::println);
    }
}
