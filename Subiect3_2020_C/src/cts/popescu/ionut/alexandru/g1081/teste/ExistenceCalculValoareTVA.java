package cts.popescu.ionut.alexandru.g1081.teste;

import cts.popescu.ionut.alexandru.g1081.exceptii.ExceptieFacturaFaraProduse;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class ExistenceCalculValoareTVA {
    @Test(expected = ExceptieFacturaFaraProduse.class)
    @Category(ICategorieTeste.class)
    public void test() throws ExceptieFacturaFaraProduse {
        Facturare facturare = new Facturare();
        facturare.calculValoareTVA(23.0,null);
    }
}
