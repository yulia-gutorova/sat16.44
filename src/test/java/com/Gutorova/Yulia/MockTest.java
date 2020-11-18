package com.Gutorova.Yulia;
//import static org.mockito.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class MockTest {

@Test
     public void mockTestDecimalToBinary()
    {
        DecimalToBinary dec = mock(DecimalToBinary.class);
        when(dec.convert(1)).thenReturn("1");
        Assert.assertEquals("1", dec.convert(1));
        verify(dec).convert(1);
        verify(dec, atLeastOnce()).convert(1);
        verify(dec, atLeast(1)).convert(1);
        verify(dec, times(1)).convert(1);
    }

@Test
    public void mockTestClearIntegerList ()
    {

        List <String> str = List.of("1", "2", "3", "4", "5");
        List <Integer> integers = List.of(1,2,3,4,5);
        ClearIntegerList clear = mock(ClearIntegerList.class);
        when(clear.clearIntegerList(str)).thenReturn(integers);
        assertArrayEquals(integers.toArray(), clear.clearIntegerList(str).toArray());
        verify(clear).clearIntegerList(str);
        verify(clear,atLeastOnce()).clearIntegerList(any());
    }

}
