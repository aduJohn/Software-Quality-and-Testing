package FactoryMethod;

public class Medic extends PersonalMedical {
    public Medic(String nume, long marca) {
        super(nume, marca);
    }

    @Override
    public void descriere() {
        System.out.println(getNume() + " " + getMarca() + " - medic");
    }
}
