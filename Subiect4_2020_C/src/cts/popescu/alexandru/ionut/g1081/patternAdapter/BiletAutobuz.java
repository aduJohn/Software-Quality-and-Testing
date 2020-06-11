package cts.popescu.alexandru.ionut.g1081.patternAdapter;

public class BiletAutobuz implements IBilet {
    @Override
    public void plataBilet(float suma) {
        System.out.println("Se achita biletul de autobuz cu un pret de "+suma);
    }
}
