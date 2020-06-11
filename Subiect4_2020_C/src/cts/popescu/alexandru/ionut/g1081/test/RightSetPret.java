package cts.popescu.alexandru.ionut.g1081.test;

import cts.popescu.alexandru.ionut.g1081.exceptii.ExceptiePretIncorect;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class RightSetPret {
    @Test
    @Category(ICategorieTeste.class)
    public void testRightTipPromotie2() throws ExceptiePretIncorect {
        Produs produs = new Produs("Paine",10.0);
        Double valoareAsteptata = 50.00;
        produs.setPret(100.00,2);
        assertEquals(valoareAsteptata,produs.getPret(),0.01);
    }
    @Test
    @Category(ICategorieTeste.class)
    public void testRightTipPromotie5() throws ExceptiePretIncorect {
        Produs produs = new Produs("Paine",10.0);
        Double valoareAsteptata = 100.00;
        produs.setPret(100.00,5);
        assertEquals(valoareAsteptata,produs.getPret(),0.01);
    }

}
