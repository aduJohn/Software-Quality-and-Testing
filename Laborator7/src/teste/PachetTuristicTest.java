package teste;

import categorii.ICategorieTestePersoaneTinere;
import categorii.ICategorieTestePersoaneVarstnice;
import clase.IPersoana;
import clase.PachetTuristic;
import dubluri.PersoanaFake;
import dubluri.PersoanaStub;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    public void aplicaDiscountVarstniciBoundaryTestStub(){
        IPersoana persoanaStub = new PersoanaStub();
        PachetTuristic pachet = new PachetTuristic(persoanaStub, "Bucuresti",100.0);
        pachet.aplicaDiscountVarstnici(5);
        double valoareAsteptata = 95;
        assertEquals(valoareAsteptata,pachet.getPret(),0.1);
    }
    @Test
    @Category(ICategorieTestePersoaneVarstnice.class)
    public void aplicaDiscountVarstniciRightTestFake(){
        PersoanaFake fake = new PersoanaFake();
        fake.setVarsta(80);
        PachetTuristic pachet = new PachetTuristic(fake,"Bucuresti",100.0);
        pachet.aplicaDiscountVarstnici(5);
        double valoareAsteptata = 95.0;
        assertEquals(valoareAsteptata,pachet.getPret(),0.1);
    }
    @Test
    @Category(ICategorieTestePersoaneTinere.class)
    public void aplicaDiscountTanarRightTestFake(){
        PersoanaFake fake = new PersoanaFake();
        fake.setVarsta(30);
        PachetTuristic pachet = new PachetTuristic(fake,"Bucuresti",100.0);
        pachet.aplicaDiscountVarstnici(5);
        double valoareAsteptata = 100;
        assertEquals(valoareAsteptata,pachet.getPret(),0.1);
    }
}