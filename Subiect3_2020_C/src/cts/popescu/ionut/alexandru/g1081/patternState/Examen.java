package cts.popescu.ionut.alexandru.g1081.patternState;

public class Examen {
    private SustinereExamen sustinereExamen;

    public Examen() {
        this.sustinereExamen = new SustinerePractica();
    }

    public void setStare(StareExamen stare){
        if(stare == StareExamen.PRACTIC){
            this.sustinereExamen = new SustinerePractica();
        }else if(stare == StareExamen.GRILA){
            this.sustinereExamen = new SustinereGrila();
        }else {
            this.sustinereExamen = new SustinereOrala();
        }
    }

    public void afisareExamen(){
        this.sustinereExamen.sustinereExamen();
    }
}
