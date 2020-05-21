package Strategy;

public class Client {
    IPlata metodaPlata;

    public void setMetodaPlata(IPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteReteta(int suma){
        metodaPlata.plateste(suma);
    }
}
