package cts.popescu.alexandru.ionut.g1081.patternAdapter;

public class BiletTramvaiAdaptor implements IBilet {
    private BiletTramvai biletTramvai;

    public BiletTramvaiAdaptor(BiletTramvai biletTramvai) {
        this.biletTramvai = biletTramvai;
    }

    @Override
    public void plataBilet(float suma) {
        biletTramvai.platesteBiletTramvai(suma);
    }
}
