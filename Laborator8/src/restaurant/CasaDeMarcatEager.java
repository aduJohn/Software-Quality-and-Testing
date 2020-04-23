package restaurant;

public class CasaDeMarcatEager {
    private double suma;
    private static CasaDeMarcatEager instanta= new CasaDeMarcatEager();
    private CasaDeMarcatEager(){
        this.suma=0;
    }
    public static CasaDeMarcatEager getInstance(){
        return instanta;
    }
    public void Incasare(double suma){
        this.suma+=suma;
    }

    public double getSuma() {
        return suma;
    }
}
