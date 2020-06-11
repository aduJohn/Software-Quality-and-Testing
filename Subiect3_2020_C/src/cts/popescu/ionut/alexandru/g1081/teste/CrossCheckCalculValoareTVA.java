package cts.popescu.ionut.alexandru.g1081.teste;

import cts.popescu.ionut.alexandru.g1081.exceptii.ExceptieFacturaFaraProduse;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class CrossCheckCalculValoareTVA {
    @Test
    @Category(ICategorieTeste.class)
    public void test() throws ExceptieFacturaFaraProduse {
        Facturare facturare = new Facturare();
        Double valoareAsteptata = crossCheckCalculTVA(119.0,100.0);
        Double valoareCalculata = facturare.calculValoareTVA(100.0,19.0);
        assertEquals(valoareAsteptata,valoareCalculata,0.01);
    }
    public Double crossCheckCalculTVA(Double valoareaCuTVA,Double valoareFaraTVA){
        if(valoareaCuTVA!=null && valoareFaraTVA!=null){
            return valoareaCuTVA-valoareFaraTVA;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
