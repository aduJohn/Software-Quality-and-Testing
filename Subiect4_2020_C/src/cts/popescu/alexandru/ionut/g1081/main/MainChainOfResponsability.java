package cts.popescu.alexandru.ionut.g1081.main;

import cts.popescu.alexandru.ionut.g1081.patternChainOfResponsibility.*;

public class MainChainOfResponsability {
    public static void main(String[] args) {
        Handler tramvai = new Tramvai();
        Handler metrou = new Metrou();
        Handler tren = new Tren();
        Handler autobuz = new Autobuz();
        autobuz.setNextHandler(tramvai);
        tramvai.setNextHandler(metrou);
        metrou.setNextHandler(tren);

        Calator calator = new Calator();
        Calator calator2 = new Calator();
        Calator calator3 = new Calator();
        Calator calator4 = new Calator();
        Calator calator5 = new Calator();

        autobuz.deplasareAutovehicul(calator,20);
        autobuz.deplasareAutovehicul(calator2,4);
        autobuz.deplasareAutovehicul(calator3,7);
        autobuz.deplasareAutovehicul(calator4,9);
        autobuz.deplasareAutovehicul(calator5,13);
    }
}
