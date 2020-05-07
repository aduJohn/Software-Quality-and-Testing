package AdapterBanca;

public class CreditIpotecar implements  InterfataCredit {
    private double suma;

    public CreditIpotecar(double suma) {
        this.suma = suma;
    }

    @Override
    public void oferaCredit() {
        System.out.println("A fost oferit un credit cu suma "+this.suma);
    }

    @Override
    public double calculeazaRata(int numarLuni) {
        return this.suma/numarLuni;
    }
}
