package teste;

import categorii.ICategorieTesteFun;
import categorii.ICategorieTesteNoFun;
import clase.Persoana;
import exceptii.CNPNullException;
import exceptii.CaractereInvalideException;
import exceptii.CifreInvalideException;
import exceptii.LungimeInvalidaException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.Calendar;

import static org.junit.Assert.*;

public class PersoanaTest {
    @Test
    public void testConstructorRight(){
        Persoana persoana = new Persoana();
        assertNotNull(persoana);
    }
    @Test
    public void testGetVarstaRight(){
        Persoana persoana = new Persoana("Anonim","2981107469999");
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
    public void testGetVarstaRight1800(){
        Persoana persoana = new Persoana("Anonim","3990101469999");
        int varstaObtinuta = persoana.getVarsta();
        int varstaAsteptata = 121;
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
    @Test
    @Category(ICategorieTesteNoFun.class)
    public void testGetSexCifra1(){
        Persoana persoana = new Persoana("Anonim","1980224999999");
        String caracterAsteptat = "M";
        assertEquals(caracterAsteptat,persoana.getSex());
    }
    @Test
    @Category(ICategorieTesteNoFun.class)
    public void testGetSexCifra2(){
        Persoana persoana = new Persoana("Anonim","2980224999999");
        String caracterAsteptat = "F";
        assertEquals(caracterAsteptat,persoana.getSex());
    }
    @Test
    @Category(ICategorieTesteNoFun.class)
    public void testGetSexCifra3(){
        Persoana persoana = new Persoana("Anonim","3980224999999");
        String caracterAsteptat = "M";
        assertEquals(caracterAsteptat,persoana.getSex());
    }
    @Test
    @Category(ICategorieTesteNoFun.class)
    public void testGetSexCifra4(){
        Persoana persoana = new Persoana("Anonim","4980224999999");
        String caracterAsteptat = "F";
        assertEquals(caracterAsteptat,persoana.getSex());
    }
    @Test
    @Category(ICategorieTesteNoFun.class)
    public void testGetSexCifra5(){
        Persoana persoana = new Persoana("Anonim","5980224999999");
        String caracterAsteptat = "M";
        assertEquals(caracterAsteptat,persoana.getSex());
    }
    @Test
    @Category(ICategorieTesteNoFun.class)
    public void testGetSexCifra6(){
        Persoana persoana = new Persoana("Anonim","6980224999999");
        String caracterAsteptat = "F";
        assertEquals(caracterAsteptat,persoana.getSex());
    }
    @Test
    @Category(ICategorieTesteNoFun.class)
    public void testGetSexCifraNA(){
        Persoana persoana = new Persoana("Anonim","7980224999999");
        String caracterAsteptat = "N/A";
        assertEquals(caracterAsteptat,persoana.getSex());
    }

    @Test(expected = CaractereInvalideException.class)
    public void testCheckCNPRight(){
        Persoana persoana = new Persoana("Ion","1981107t30095");
        persoana.checkCNP();
    }
    @Test
    public void testCheckCNPRightCifra1LaFinal(){
        Persoana persoana = new Persoana("Ion","1981107203611");
        assertTrue(persoana.checkCNP());
    }
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