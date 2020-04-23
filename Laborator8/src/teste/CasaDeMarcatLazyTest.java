package teste;

import org.junit.Test;
        import restaurant.CasaDeMarcatLazy;

        import static org.junit.Assert.*;

public class CasaDeMarcatLazyTest {

    @Test
    public void CasaDeMarcatLazySingletonTest(){
        CasaDeMarcatLazy casa1 = CasaDeMarcatLazy.getInstance();
        CasaDeMarcatLazy casa2 = CasaDeMarcatLazy.getInstance();

        assertSame(casa1,casa2);
    }
}