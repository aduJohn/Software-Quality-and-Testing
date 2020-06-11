package cts.popescu.ionut.alexandru.g1081.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class RightSetPret {
    @Test
    @Category(ICategorieTeste.class)
    public void testRight1(){
        Produs produs = new Produs("Paine",20.0);
        Double valoareAsteptata = 1.0;
        produs.setPret(1.0,1);
        assertEquals(valoareAsteptata,produs.getPret(),0.01);
    }
    @Test
    public void testRight2(){
        Produs produs = new Produs("Paine",20.0);
        Double valoareAsteptata = 5.0;
        produs.setPret(10.0,2);
        assertEquals(valoareAsteptata,produs.getPret(),0.01);
    }
    @Test
    public void testRight3(){
        Produs produs = new Produs("Paine",20.0);
        Double valoareAsteptata = 4.0;
        produs.setPret(4.0,3);
        assertEquals(valoareAsteptata,produs.getPret(),0.01);
    }
}
