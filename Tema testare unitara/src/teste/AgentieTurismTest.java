package teste;

import categorii.ICategorieTesteFun;
import categorii.ICategorieTesteNoFun;
import clase.AgentieTurism;
import clase.PachetTuristic;
import clase.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class AgentieTurismTest {
    @Test
    @Category(ICategorieTesteNoFun.class)
    public void constructorRightTest(){
        AgentieTurism agentieTurism = new AgentieTurism();
        assertNotNull(agentieTurism);
    }

    @Test
    @Category(ICategorieTesteFun.class)
    public void adaugaPachetTuristicTest(){
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetTuristic pachetTuristic = new PachetTuristic(null,"Bucuresti",100.0);
        agentieTurism.adaugaPachet(pachetTuristic);

        try {
            final Field field = agentieTurism.getClass().getDeclaredField("pacheteTuristice");
            field.setAccessible(true);
            ArrayList<PachetTuristic> pacheteTuristice = (ArrayList) field.get(agentieTurism);
            assertEquals(pachetTuristic,pacheteTuristice.get(pacheteTuristice.size()-1));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            fail();
        }

    }

    @Test
    @Category(ICategorieTesteFun.class)
    public void calculareSumaTotalaPachete0RightTest(){
        AgentieTurism agentieTurism = new AgentieTurism();
        double sumaAsteptata = 0;
        assertEquals(sumaAsteptata,agentieTurism.calculareSumaTotalaPachete(),0.1);
    }
    @Test
    @Category(ICategorieTesteFun.class)
    public void calculareSumaTotalaPachete1RightTest(){
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetTuristic pachetTuristic = new PachetTuristic(null,"Bucuresti",100.0);
        agentieTurism.adaugaPachet(pachetTuristic);
        double sumaAsteptata = 100.0;
        assertEquals(sumaAsteptata,agentieTurism.calculareSumaTotalaPachete(),0.1);
    }
    @Test
    @Category(ICategorieTesteFun.class)
    public void calculareSumaTotalaPachete2RightTest(){
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetTuristic pachetTuristic1 = new PachetTuristic(null,"Bucuresti",100.0);
        agentieTurism.adaugaPachet(pachetTuristic1);
        PachetTuristic pachetTuristic2 = new PachetTuristic(null,"Bucuresti",50.0);
        agentieTurism.adaugaPachet(pachetTuristic2);
        double sumaAsteptata = 150.0;
        assertEquals(sumaAsteptata,agentieTurism.calculareSumaTotalaPachete(),0.1);
    }
}