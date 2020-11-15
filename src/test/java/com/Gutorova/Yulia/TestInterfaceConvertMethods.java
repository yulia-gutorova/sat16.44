package com.Gutorova.Yulia;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class TestInterfaceConvertMethods {

    List<InterfaceConvertMethods> convertList = new ArrayList<>();

    @Test
    public void testMethods ()
    {
        convertList.add(new DecimalToBinary());
        convertList.add (new DecimalToOctal());
        convertList.add(new DecimalToHexadecimal());

        for (InterfaceConvertMethods method: convertList)
        {
            assertNotNull(method.convert(1));
        }
    }

}
