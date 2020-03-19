package testare;

import clase.Matematica;
import com.sun.deploy.security.ruleset.ExceptionRule;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MatematicaTest {
    private Matematica matematica;
    @Before
    public void setUp(){
        matematica = new Matematica();
    }
    @Test
    public void testSuma(){
        int rezultatObtinut = matematica.suma(6,9);
        int rezultatAsteptat = 15;
        assertEquals(rezultatAsteptat,rezultatObtinut);
    }
    @Test
    public void testRaport(){
        double rezultatObtinut = matematica.raport(9,3);
        double rezultatAsteptat = 3;
        assertEquals(rezultatAsteptat,rezultatObtinut,0.01);
    }
    @Test
    public void testRaportZecimale(){
        double rezultatObtinut = matematica.raport(8,3);
        double rezultatAsteptat = 2.66;
        assertEquals(rezultatAsteptat,rezultatObtinut,0.1);
    }
    @Test
    public void testPar(){
        int numarVerificatPar = 6;
        assertTrue(matematica.estePar(6));
    }
    @Test
    public void testImpar(){
        int numarVerificatInpar = 7;
        assertFalse(matematica.estePar(7));
    }
    @Test
    public void testRaportImpartireZero(){
        try{
            matematica.raport(65,0);
            fail("Functia raport nu arunca exceptie in cazul impartirii la 0");
        }catch (IllegalArgumentException iae){

        }
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRaportImpartireZeroExpected(){
        matematica.raport(65,0);
    }
    @Test
    public void testNumerePareVerificareNull(){
        assertNull(matematica.nNumerePare(0));
    }
    @Test
    public void testNumerePareVerificareNonNull(){
        assertNotNull(matematica.nNumerePare(1));
    }
}