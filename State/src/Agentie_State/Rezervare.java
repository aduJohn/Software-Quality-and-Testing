package Agentie_State;

public class Rezervare {
    private StareRezervare stareCurenta;

    public Rezervare() {
        this.stareCurenta = new Neplatita();
    }
    public void schimbareStare(StariPosibile stare){
        if(stare == StariPosibile.EFECTUATA){
            this.stareCurenta = new Efectuata();
        }else{
            if(stare == StariPosibile.NEPLATITA){
                this.stareCurenta = new Neplatita();
            }else{
                this.stareCurenta = new Platita();
            }
        }
    }
    public void afisareStareCurenta(){
        this.stareCurenta.descriereStare();
    }
}
