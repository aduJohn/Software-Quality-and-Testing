package cts.popescu.alexandru.ionut.g1081.patternAdapter;

public class BiletMetrouAdaptor implements IBilet {
    private BiletMetrou biletMetrou;

    public BiletMetrouAdaptor(BiletMetrou biletMetrou) {
        this.biletMetrou = biletMetrou;
    }

    @Override
    public void plataBilet(float suma) {
        biletMetrou.platesteBiletMetrou(suma);
    }
}
