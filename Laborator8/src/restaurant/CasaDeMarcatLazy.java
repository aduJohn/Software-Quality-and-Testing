package restaurant;

public class CasaDeMarcatLazy {
    private double suma;
    private static CasaDeMarcatLazy instanta=null;
    private CasaDeMarcatLazy(){
        this.suma=0;
    }
    public static synchronized CasaDeMarcatLazy getInstance(){
        if(instanta==null){
            instanta = new CasaDeMarcatLazy();
        }
        return instanta;
    }
    public void Incasare(double suma){
        this.suma+=suma;
    }

    public double getSuma() {
        return suma;
    }
}
