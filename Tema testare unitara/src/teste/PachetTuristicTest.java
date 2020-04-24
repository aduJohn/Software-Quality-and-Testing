package teste;

import categorii.ICategorieTesteFun;
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
    public void poateRezervaSub18TestFake(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(17);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake,"Bucuresti",100.0);
        assertFalse(pachetTuristic.poateRezerva());
    }
    @Test
    public void poateRezervaPeste18TestFake(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(18);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake,"Bucuresti",100.0);
        assertFalse(pachetTuristic.poateRezerva());
    }
    @Test
    public void getClientRightStub(){
        IPersoana persoanaStub = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaStub,"Bucuresti",100.0);
        assertSame(persoanaStub,pachetTuristic.getClient());
    }
    @Test
    public void setClientRightStub(){
        PachetTuristic pachetTuristic = new PachetTuristic(null,"Bucuresti",100.0);
        IPersoana persoanaStub = new PersoanaStub();
        pachetTuristic.setClient(persoanaStub);
        assertSame(persoanaStub,pachetTuristic.getClient());
    }
    @Test
    public void getDestinatieRightTest(){
        PachetTuristic pachetTuristic = new PachetTuristic(null,"Bucuresti",100.0);
        String destinatieAsteptata = "Bucuresti";
        assertEquals(destinatieAsteptata,pachetTuristic.getDestinatie());
    }
    @Test
    public void getPretRightTest(){
        PachetTuristic pachetTuristic = new PachetTuristic(null,"Bucuresti",100.0);
        double pretAsteptat = 100.0;
        assertEquals(pretAsteptat,pachetTuristic.getPret(),0.1);
    }
    @Test
    public void setPretRightTest(){
        PachetTuristic pachetTuristic = new PachetTuristic(null,"Bucuresti",100.0);
        pachetTuristic.setPret(25.7);
        double pretAsteptat = 25.7;
        assertEquals(pretAsteptat,pachetTuristic.getPret(),0.1);
    }
    @Test
    public void setDestinatieRightTest(){
        PachetTuristic pachetTuristic = new PachetTuristic(null,"Pitesti",100.0);
        pachetTuristic.setDestinatie("Bucuresti");
        String destinatieAsteptata = "Bucuresti";
        assertEquals(destinatieAsteptata,pachetTuristic.getDestinatie());
    }

    @Test
    @Category(ICategorieTesteFun.class)
    public void aplicaDiscountVarstniciBoundaryTestStub(){
        IPersoana persoanaStub = new PersoanaStub();
        PachetTuristic pachet = new PachetTuristic(persoanaStub, "Bucuresti",100.0);
        pachet.aplicaDiscountVarstnici(5);
        double valoareAsteptata = 95;
        assertEquals(valoareAsteptata,pachet.getPret(),0.1);
    }
    @Test
    @Category(ICategorieTesteFun.class)
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