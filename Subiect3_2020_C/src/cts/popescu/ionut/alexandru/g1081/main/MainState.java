package cts.popescu.ionut.alexandru.g1081.main;

import cts.popescu.ionut.alexandru.g1081.patternState.Examen;
import cts.popescu.ionut.alexandru.g1081.patternState.StareExamen;

public class MainState {
    public static void main(String[] args) {
        Examen cts = new Examen();
        Examen psi = new Examen();
        Examen psw = new Examen();

        cts.afisareExamen();
        cts.setStare(StareExamen.GRILA);
        cts.afisareExamen();
        psw.afisareExamen();
        psi.setStare(StareExamen.ORAL);
        psi.afisareExamen();
    }
}
