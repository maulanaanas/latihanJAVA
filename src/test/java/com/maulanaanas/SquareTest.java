package com.maulanaanas;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void testLuasPersegi(){
        Square square = new Square(7);

        // Mengecek atau verify -> Assert
        Assert.assertEquals(49, square.getLuas(),0);
    }
}
