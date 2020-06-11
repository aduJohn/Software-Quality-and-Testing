package cts.popescu.ionut.alexandru.g1081.teste;

import cts.popescu.ionut.alexandru.g1081.exceptii.ExceptieFacturaFaraProduse;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class InverseCalculValoareTVA {
    @Test
    @Category(ICategorieTeste.class)
    public void test() throws ExceptieFacturaFaraProduse {
        Facturare facturare = new Facturare();
        Double valoareaCalculata = facturare.calculValoareTVA(100.0,0.19);
        Double valoareFaraTVA = (100*valoareaCalculata)/0.19;
        Double valoareAsteptata = 100.0;
        assertEquals(valoareAsteptata,valoareFaraTVA,0.01);
    }
}
