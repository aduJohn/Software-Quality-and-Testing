package AdapterBanca;

import Framework.CreditLeasing;

public class AdapterClase extends CreditLeasing implements InterfataCredit{
    public AdapterClase(double pretProdus, int numarLuni) {
        super(pretProdus, numarLuni);
    }

    @Override
    public void oferaCredit() {
        super.oferaLeasing();
    }

    @Override
    public double calculeazaRata(int numarLuni) {
        return super.calculareSumaPlataLunara();
    }
}
