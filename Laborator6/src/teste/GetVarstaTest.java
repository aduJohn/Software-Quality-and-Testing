package teste;

import clase.Persoana;
import exceptii.CNPNullException;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class GetVarstaTest {
    @Test
    public void testGetVarstaRight(){
        Persoana persoana = new Persoana("Anonim","1981107469999");
        int varstaObtinuta = persoana.getVarsta();
        int varstaAsteptata = 21;
        assertEquals(varstaAsteptata,varstaObtinuta);
    }
    @Test
    public void testGetVarstaRight2000(){
        Persoana persoana = new Persoana("Anonim","6011107469999");
        int varstaObtinuta = persoana.getVarsta();
        int varstaAsteptata = 18;
        assertEquals(varstaAsteptata,varstaObtinuta);
    }
    @Test
    public void testGetVarstaBoundary1900(){
        Persoana persoana = new Persoana("Anonim","1000101469999");
        int varstaObtinuta = persoana.getVarsta();
        int varstaAsteptata = 120;
        assertEquals(varstaAsteptata,varstaObtinuta);
    }
    @Test
    public void testGetVarstaBoundary1999(){
        Persoana persoana = new Persoana("Anonim","1991231469999");
        int varstaObtinuta = persoana.getVarsta();
        int varstaAsteptata = 20;
        assertEquals(varstaAsteptata,varstaObtinuta);
    }
    @Test
    public void testGetVarstaBoundary2000(){
        Persoana persoana = new Persoana("Anonim","5000101999999");
        int varstaObtinuta = persoana.getVarsta();
        int varstaAsteptata = 20;
        assertEquals(varstaAsteptata,varstaObtinuta);
    }
    @Test
    public void testGetVarstaBoundaryToday(){
        Calendar dataCurenta = Calendar.getInstance();
        int an = dataCurenta.get(Calendar.YEAR) - 2000;
        int luna = dataCurenta.get(Calendar.MONTH) + 1;
        int zi = dataCurenta.get(Calendar.DAY_OF_MONTH);
        String CNP = "5"+dataInFormatCorect(an)+dataInFormatCorect(luna)+dataInFormatCorect(zi)+"999999";
        Persoana persoana = new Persoana("Anonim",CNP);
        int varstaObtinuta = persoana.getVarsta();
        int varstaAsteptata = 0;
        assertEquals(varstaAsteptata,varstaObtinuta);
    }
    public String dataInFormatCorect(int valoare){
        if(valoare<10){
            return new String("0"+valoare);
        }else{
            return new String(""+valoare);
        }
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetVarstaException(){
        Persoana persoane = new Persoana("Anonim","8000101999999");
        persoane.getVarsta();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetVarstaExceptionOfLimits(){
        Calendar dataCurenta = Calendar.getInstance();
        int an = dataCurenta.get(Calendar.YEAR) - 2000;
        int luna = dataCurenta.get(Calendar.MONTH) + 1;
        int zi = dataCurenta.get(Calendar.DAY_OF_MONTH)+1;
        String CNP = "5"+dataInFormatCorect(an)+dataInFormatCorect(luna)+dataInFormatCorect(zi)+"999999";
        Persoana persoana = new Persoana("Anonim",CNP);
        persoana.getVarsta();
    }
    @Test(timeout = 10)
    public void testGetVarstaPerformance(){
        Persoana persoana = new Persoana("Anonim","1991231469999");
        persoana.getVarsta();
    }
    //Ordering
    @Test
    public void testGetVarstaOrdering(){
        Persoana persoana1 = new Persoana("Anonim","1981231469999");
        Persoana persoana2 = new Persoana("Anonim","1951231469999");
        assertTrue(persoana1.getVarsta() < persoana2.getVarsta());
    }

    @Test
    public void testGetVarstaCardinality(){
        Persoana persoana = new Persoana("Anonim","519040201999999");
        int varstaAsteptata = 1;
        assertEquals(varstaAsteptata,persoana.getVarsta());
    }

}