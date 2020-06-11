package cts.popescu.ionut.alexandru.g1081.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class BoundarySetPret {
    @Test
    @Category(ICategorieTeste.class)
    public void testLimitaSuperioara(){
        Produs produsDummy = new Produs("Paine",15.5);
        double pretAsteptat = 1000;
        produsDummy.setPret(1000.0,1);
        assertEquals(pretAsteptat,produsDummy.getPret(),0.01);
    }
    @Test
    @Category(ICategorieTeste.class)
    public void testLimitaInferioara(){
        Produs produsDummy = new Produs("Paine",15.5);
        double pretAsteptat = 1;
        produsDummy.setPret(1.0,1);
        assertEquals(pretAsteptat,produsDummy.getPret(),0.01);
    }
}
