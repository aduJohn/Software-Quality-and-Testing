package Agentie_Facade;

public class Zbor {
    private String adresaPornire;
    private String adresaDestinatie;
    private String oraPornire;
    private float durataOre;

    public Zbor(String adresaPornire, String adresaDestinatie, String oraPornire, float durataOre) {
        this.adresaPornire = adresaPornire;
        this.adresaDestinatie = adresaDestinatie;
        this.oraPornire = oraPornire;
        this.durataOre = durataOre;
    }

    @Override
    public String toString() {
        return "Zbor{" +
                "adresaPornire='" + adresaPornire + '\'' +
                ", adresaDestinatie='" + adresaDestinatie + '\'' +
                ", oraPornire='" + oraPornire + '\'' +
                ", durataOre=" + durataOre +
                '}';
    }
}
