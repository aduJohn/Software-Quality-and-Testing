package Composite;

public abstract class Sucursala {

    private String numeManager;

    public Sucursala(String numeManager) {
        this.numeManager = numeManager;
    }
    public String getNumeManager() {
        return numeManager;
    }
    public abstract void adaugaSucursala(Sucursala sucursala);
    public abstract void stergeSucursala(Sucursala sucursala);
    public abstract Sucursala getSucursala(int pozitie);

    public abstract void descriereSucursala();
}
