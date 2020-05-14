package Composite;

import java.util.ArrayList;
import java.util.List;

public class Agentie extends Sucursala {

    private List<Sucursala> listaSucursale;

    public Agentie(String numeManager) {
        super(numeManager);
        this.listaSucursale =  new ArrayList<>();
    }

    @Override
    public void adaugaSucursala(Sucursala sucursala) {
        this.listaSucursale.add(sucursala);
    }

    @Override
    public void stergeSucursala(Sucursala sucursala) {
        this.listaSucursale.remove(sucursala);
    }

    @Override
    public Sucursala getSucursala(int pozitie) {
        return this.listaSucursale.get(pozitie);
    }

    @Override
    public void descriereSucursala() {
        System.out.println("Descriere agentie:");
        System.out.println("Managerul agentie: "+getNumeManager());
        for (Sucursala sucursala:this.listaSucursale) {
            sucursala.descriereSucursala();
        }
    }

}
