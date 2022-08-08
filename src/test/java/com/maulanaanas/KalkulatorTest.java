package com.maulanaanas;

import org.junit.Assert;
import org.junit.Test;

public class KalkulatorTest {

    @Test
    public void testKalkulatorKali(){
        Kalkulator kalkulator = new Kalkulator(10,10);
        Assert.assertEquals(100, kalkulator.getHasilPerkalian(), 0);
    }
}
