package AdapterBanca;

import Framework.CreditLeasing;

public class MainAdapter {
    public static void oferaDetaliiCredit(InterfataCredit credit,int numarLuni){
        credit.oferaCredit();
        System.out.println("Rata pentru acest credit este "+Math.round(credit.calculeazaRata(numarLuni)));
    }
    public static void main(String[] args) {
        CreditIpotecar creditIpotecar = new CreditIpotecar(250);
        oferaDetaliiCredit(creditIpotecar,12);

        CreditLeasing creditLeasing = new CreditLeasing(10000,24);
        AdapterCredit adapterCredit = new AdapterCredit(creditLeasing);
        oferaDetaliiCredit(adapterCredit,12);

        AdapterClase adapterClase = new AdapterClase(2400,12);
        oferaDetaliiCredit(adapterClase,12);
    }
}
