package Framework;

public class CreditLeasing {
    private double pretProdus;
    private int numarLuni;
    public CreditLeasing(double pretProdus,int numarLuni) {
        this.pretProdus = pretProdus;
        this.numarLuni = numarLuni;
    }

    public void oferaLeasing(){
        System.out.println("A fost oferit un leasing de "+this.pretProdus);
    }
    public double calculareSumaPlataLunara(){
        return this.pretProdus/this.numarLuni;
    }
    public void afisareSumaPlataLunara(){
        System.out.println("Trebuie platit lunar o suma in valoare de "+this.calculareSumaPlataLunara());
    }
}
