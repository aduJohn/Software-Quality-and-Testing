package FactoryMethod;

public class Asistent extends PersonalMedical {

    public Asistent(String nume, long marca) {
        super(nume, marca);
    }

    @Override
    public void descriere() {
        System.out.println(getNume() + " " + getMarca() + " - asistent");
    }
}
