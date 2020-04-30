package FactoryMethod;

public class Brancardier extends PersonalMedical
{
    public Brancardier(String nume, long marca) {
        super(nume, marca);
    }

    @Override
    public void descriere() {
        System.out.println(getNume() + " " + getMarca() + " - brancardier");
    }
}
