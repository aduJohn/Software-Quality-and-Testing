package teste;

import clase.Persoana;
import exceptii.CNPNullException;
import exceptii.CaractereInvalideException;
import exceptii.CifreInvalideException;
import exceptii.LungimeInvalidaException;
import org.junit.Test;
import static org.junit.Assert.*;
public class CheckCNPTest {

    @Test(expected = CaractereInvalideException.class)
    public void testCheckCNPConformanceCaracterInvalid(){
        Persoana persoana = new Persoana("Ion","1981107t30095");
        persoana.checkCNP();
    }
    @Test(expected = CifreInvalideException.class)
    public void testCheckCNPConformanceCifra0(){
        Persoana persoana = new Persoana("Ion","0981107630095");
        persoana.checkCNP();
    }
    @Test(expected = LungimeInvalidaException.class)
    public void testCheckCNPConformanceLungimeCorecta() {
        Persoana persoana = new Persoana("Ion","098110763009511");
        persoana.checkCNP();
    }
    @Test
    public void testCheckCNPConformanceFormatValid(){
        Persoana persoana = new Persoana("Ion","1900129321797");
        assertTrue(persoana.checkCNP());
    }
    @Test
    public void testCheckCNPConformanceCNPInvalid(){
        Persoana persoana = new Persoana("Ion","1900129321798");
        assertFalse(persoana.checkCNP());
    }
    @Test(expected = CNPNullException.class)
    public void testCheckCNPExistance(){
        Persoana persoana = new Persoana("Anonim",null);
        persoana.checkCNP();
    }
}
