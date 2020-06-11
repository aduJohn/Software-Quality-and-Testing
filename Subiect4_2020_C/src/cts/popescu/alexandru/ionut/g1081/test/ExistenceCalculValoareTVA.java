package cts.popescu.alexandru.ionut.g1081.test;

import cts.popescu.alexandru.ionut.g1081.exceptii.ExceptieFacturaFaraProduse;
import cts.popescu.alexandru.ionut.g1081.exceptii.ExceptiePretIncorect;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ExistenceCalculValoareTVA {
    @Test(expected = ExceptieFacturaFaraProduse.class)
    @Category(ICategorieTeste.class)
    public void test() throws ExceptieFacturaFaraProduse {
        Facturare facturare = new Facturare();
        facturare.calculValoareTVA(null,null);
    }
}
