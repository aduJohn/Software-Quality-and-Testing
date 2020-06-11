package cts.popescu.ionut.alexandru.g1081.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class BoundarySetPret {
    @Test
    @Category(ICategorieTeste.class)
    public void testMargineInferioara(){
        Produs produs = new Produs("Paine",20.0);
        Double valoareAsteptata = 1.0;
        produs.setPret(1.0,1);
        assertEquals(valoareAsteptata,produs.getPret(),0.01);
    }
    @Test
    public void testMargineSuperioara(){
        Produs produs = new Produs("Paine",20.0);
        Double valoareAsteptata = 1000.0;
        produs.setPret(1000.0,1);
        assertEquals(valoareAsteptata,produs.getPret(),0.01);
    }
}
