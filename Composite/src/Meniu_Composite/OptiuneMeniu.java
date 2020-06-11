package Meniu_Composite;

public interface OptiuneMeniu {
    void adaugaOptiuneMeniu(OptiuneMeniu optiuneMeniu);
    void stergeOptiuneMeniu(OptiuneMeniu optiuneMeniu);
    OptiuneMeniu getOptiuneMeniu(int i);
    void descriere(int level);
    void apasaMeniu(int level);
}
