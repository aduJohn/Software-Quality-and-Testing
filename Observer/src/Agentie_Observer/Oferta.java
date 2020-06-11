package Agentie_Observer;

public class Oferta extends Newsletter {
    private String mesaj;

    public Oferta(String mesaj) {
        this.mesaj = mesaj;
    }

    public Oferta() {
        this.mesaj = "Nici o oferta disponibila";
    }

    public void trimiteOferta(){
        this.notificareClienti(this.mesaj);
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

}
