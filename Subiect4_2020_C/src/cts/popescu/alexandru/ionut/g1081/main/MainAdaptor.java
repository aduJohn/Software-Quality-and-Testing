package cts.popescu.alexandru.ionut.g1081.main;

import cts.popescu.alexandru.ionut.g1081.patternAdapter.*;

public class MainAdaptor {

    public static void main(String[] args) {
        IBilet biletUniversal = new BiletAutobuz();
        biletUniversal.plataBilet(100);
        BiletMetrou biletMetrou = new BiletMetrou();
        biletUniversal = new BiletMetrouAdaptor(biletMetrou);
        biletUniversal.plataBilet(200);
        BiletTramvai biletTramvai = new BiletTramvai();
        biletUniversal = new BiletTramvaiAdaptor(biletTramvai);
        biletUniversal.plataBilet(500);
    }
}
