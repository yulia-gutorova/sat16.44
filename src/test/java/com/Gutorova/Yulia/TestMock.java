package com.Gutorova.Yulia;


import org.junit.jupiter.api.*;
import java.util.List;

import static org.mockito.Mockito.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TestMock {

    @Test
    @Order(1)
    @DisplayName("Mock the test  which converts decimal to binary ")
     public void mockTestDecimalToBinary()
     {
        DecimalToBinary dec = mock(DecimalToBinary.class);
        when(dec.convert(1)).thenReturn("2");

        Assertions.assertEquals("2", dec.convert(1));
        verify(dec).convert(1);
        verify(dec, atLeastOnce()).convert(1);
        verify(dec, atLeast(1)).convert(1);
        verify(dec, times(1)).convert(1);
     }

/*    @Test
    @Order(2)
    @DisplayName("Mock the test which convert List of String to List of Integer.")
    public void mockTestClearIntegerList ()
    {

        List <String> str = List.of("1", "2", "3", "4", "5");
        List <Integer> integers = List.of(1,2,3,4,5);

        ClearIntegerList clear = mock(ClearIntegerList.class);
        when(clear.clearIntegerList(str)).thenReturn(integers);

        Assertions.assertArrayEquals(integers.toArray(), clear.clearIntegerList(str).toArray());
        verify(clear).clearIntegerList(str);
        verify(clear,atLeastOnce()).clearIntegerList(any());
    }*/

}
