package Agentie_State;

public class MainState {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare();
        rezervare.afisareStareCurenta();
        rezervare.schimbareStare(StariPosibile.PLATITA);
        rezervare.afisareStareCurenta();
        rezervare.schimbareStare(StariPosibile.EFECTUATA);
        rezervare.afisareStareCurenta();
    }
}
