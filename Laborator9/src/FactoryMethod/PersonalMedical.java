package FactoryMethod;

public abstract class PersonalMedical {
    private String nume;
    private long marca;

    public PersonalMedical(String nume, long marca) {
        this.nume = nume;
        this.marca = marca;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public long getMarca() {
        return marca;
    }

    public void setMarca(long marca) {
        this.marca = marca;
    }

    public abstract void descriere();
}
