package cts.popescu.ionut.alexandru.g1081.teste;

import cts.popescu.ionut.alexandru.g1081.exceptii.ExceptieFacturaFaraProduse;
import org.junit.Test;

public class ExistenceCalculValoareTVA {
    @Test(expected = ExceptieFacturaFaraProduse.class)
    public void test() throws ExceptieFacturaFaraProduse {
        Facturare facturare = new Facturare();
        Double valoareFaraTVA = null;
        Double valoareTVA = 123.1;
        facturare.calculValoareTVA(valoareFaraTVA,valoareTVA);
    }
}
