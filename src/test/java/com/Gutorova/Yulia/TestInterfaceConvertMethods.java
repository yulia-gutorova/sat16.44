package com.Gutorova.Yulia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

@Tag("unit")
public class TestInterfaceConvertMethods {

    List<InterfaceConvertMethods> convertList = new ArrayList<>();

    @Test
    @DisplayName("Methods don't return null")
    public void testMethods ()
    {
        convertList.add(new DecimalToBinary());
        convertList.add (new DecimalToOctal());
        convertList.add(new DecimalToHexadecimal());

        for (InterfaceConvertMethods method: convertList)
        {
            Assertions.assertNotNull(method.convert(1));
        }
    }

}
