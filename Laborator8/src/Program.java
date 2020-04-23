import banca.ContSalariu;
import restaurant.CasaDeMarcatLazy;

public class Program {
    public static void main(String[] args) {
        CasaDeMarcatLazy casa = CasaDeMarcatLazy.getInstance();
        double sumaOspatar1 = 50.0;
        casa.Incasare(sumaOspatar1);
        System.out.println(""+casa.getSuma());

        CasaDeMarcatLazy casa2 = CasaDeMarcatLazy.getInstance();
        double sumaOspatar2 = 30.0;
        casa.Incasare(sumaOspatar2);
        System.out.println(""+casa.getSuma());


        ContSalariu cont1 = ContSalariu.getInstance();
        double salariu1 = 500.0;
        cont1.incasareSalariu(salariu1);
        System.out.println(""+cont1.getSumaCont());

        ContSalariu cont2 = ContSalariu.getInstance();
        double salariu2 = 250.0;
        cont2.incasareSalariu(salariu2);
        System.out.println(""+cont2.getSumaCont());
    }
}
