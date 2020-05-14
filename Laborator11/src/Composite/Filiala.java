package Composite;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Filiala extends Sucursala {
    public Filiala(String numeManager) {
        super(numeManager);
    }

    @Override
    public void adaugaSucursala(Sucursala sucursala) {
        throw new NotImplementedException();
    }

    @Override
    public void stergeSucursala(Sucursala sucursala) {
        throw new NotImplementedException();
    }

    @Override
    public Sucursala getSucursala(int pozitie) {
        throw new NotImplementedException();
    }

    @Override
    public void descriereSucursala() {
        System.out.println("\tDescriere filiala:");
        System.out.println("\tManager Filiala"+getNumeManager());
    }

}
