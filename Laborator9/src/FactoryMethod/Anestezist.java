package FactoryMethod;

public class Anestezist extends PersonalMedical {
    public Anestezist(String nume, long marca) {
        super(nume, marca);
    }

    @Override
    public void descriere() {
        System.out.println(getNume() + " " + getMarca() + " - anestezist");
    }
}
