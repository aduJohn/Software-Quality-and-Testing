package cts.popescu.alexandru.ionut.g1081.test;

import cts.popescu.alexandru.ionut.g1081.exceptii.ExceptiePretIncorect;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class RangeSetPret {
    @Test
    @Category(ICategorieTeste.class)
    public void testRange1() throws ExceptiePretIncorect {
        Produs produs = new Produs("Paine",10.0);
        Double valoareAsteptata = 1.00;
        produs.setPret(1.00,1);
        assertEquals(valoareAsteptata,produs.getPret(),0.01);
    }
    @Test
    @Category(ICategorieTeste.class)
    public void testRange1000() throws ExceptiePretIncorect {
        Produs produs = new Produs("Paine",10.0);
        Double valoareAsteptata = 1000.00;
        produs.setPret(1000.00,1);
        assertEquals(valoareAsteptata,produs.getPret(),0.01);
    }
    @Test
    @Category(ICategorieTeste.class)
    public void testRange100() throws ExceptiePretIncorect {
        Produs produs = new Produs("Paine",10.0);
        Double valoareAsteptata = 100.00;
        produs.setPret(100.00,1);
        assertEquals(valoareAsteptata,produs.getPret(),0.01);
    }
    @Test(expected = ExceptiePretIncorect.class)
    @Category(ICategorieTeste.class)
    public void testRange0() throws ExceptiePretIncorect {
        Produs produs = new Produs("Paine",10.0);
        Double valoareAsteptata = 100.00;
        produs.setPret(0.00,1);
    }
}
