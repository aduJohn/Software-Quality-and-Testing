package banca;

public class ContSalariu {
    private double sumaCont;
    private static ContSalariu instanta = null;
    private ContSalariu(){
        this.sumaCont=0;
    }
    public static synchronized ContSalariu getInstance(){
        if(instanta==null){
            instanta = new ContSalariu();
        }
        return instanta;
    }

    public void  incasareSalariu(double salariu){
        this.sumaCont+=salariu;
    }
    public double getSumaCont() {
        return sumaCont;
    }
}
