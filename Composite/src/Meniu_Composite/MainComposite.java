package Meniu_Composite;

public class MainComposite {
    public static void main(String[] args) {
        Categorie meniuPrincipal = new Categorie("Meniu");
        Categorie meniuBautura = new Categorie("Meniu Bauturi");
        Categorie meniuMancare = new Categorie("Meniu Mancare");
        Item cola = new Item("Cola");
        Item bere = new Item("Bere");
        Item friptura = new Item("Friptura");
        Item cartofi = new Item("Cartofi");
        meniuPrincipal.adaugaOptiuneMeniu(meniuBautura);
        meniuPrincipal.adaugaOptiuneMeniu(meniuMancare);
        meniuBautura.adaugaOptiuneMeniu(cola);
        meniuBautura.adaugaOptiuneMeniu(bere);
        meniuMancare.adaugaOptiuneMeniu(friptura);
        meniuMancare.adaugaOptiuneMeniu(cartofi);
        meniuPrincipal.apasaMeniu(0);
    }
}
