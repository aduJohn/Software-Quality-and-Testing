package TH_Memento;

public class Caretaker {
    private String stare;

    public Caretaker(String stare) {
        this.stare = stare;
    }

    public String getStare() {
        return stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }
    public Memento salveazaMemento(){
        Memento memento = new Memento(stare);
        return memento;
    }
    public void restaureazaFromMemento(Memento memento) {
        this.stare = memento.getStare();
    }
}
