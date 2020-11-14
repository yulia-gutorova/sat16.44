package com.Gutorova.Yulia;

import org.junit.Test;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class TestofInputAndOutput {

    @Test
    public  void  testOfClearInput()
    {
        List<String> testString = List.of ("0", "1", "-1", "1000", "ghjg", "3.4", "^&", " ", "#");
        List<Integer> expected = List.of (0, 1, 1000);
        List <Integer> testInt = ClearIntegerList.clearIntegerList(testString);

        assertArrayEquals(expected.toArray(), testInt.toArray());
    }


}
