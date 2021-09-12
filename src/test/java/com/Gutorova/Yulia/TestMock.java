package com.Gutorova.Yulia;


import java8.lang.Integers;
import org.junit.jupiter.api.*;


import static org.mockito.Mockito.*;



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

}
