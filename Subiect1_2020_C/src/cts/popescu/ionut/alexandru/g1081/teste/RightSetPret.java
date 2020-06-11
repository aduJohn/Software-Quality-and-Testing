package cts.popescu.ionut.alexandru.g1081.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class RightSetPret {

    @Test
    @Category(ICategorieTeste.class)
    public void testCategorie1(){
        Produs produsDummy = new Produs("Paine",15.5);
        double pretAsteptat = 17;
        produsDummy.setPret(17.0,1);
        assertEquals(pretAsteptat,produsDummy.getPret(),0.01);
    }
    @Test
    @Category(ICategorieTeste.class)
    public void testCategorie2(){
        Produs produsDummy = new Produs("Paine",17.0);
        double pretAsteptat = 8.5;
        produsDummy.setPret(17.0,2);
        assertEquals(pretAsteptat,produsDummy.getPret(),0.01);
    }
    @Test
    @Category(ICategorieTeste.class)
    public void testCategorie3(){
        Produs produsDummy = new Produs("Paine",15.5);
        double pretAsteptat = 17;
        produsDummy.setPret(17.0,3);
        assertEquals(pretAsteptat,produsDummy.getPret(),0.01);
    }
}