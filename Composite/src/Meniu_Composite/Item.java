package Meniu_Composite;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Item  implements OptiuneMeniu{
    private String numeItem;

    public Item(String numeItem) {
        this.numeItem = numeItem;
    }

    @Override
    public void adaugaOptiuneMeniu(OptiuneMeniu optiuneMeniu) {
        throw new NotImplementedException();
    }

    @Override
    public void stergeOptiuneMeniu(OptiuneMeniu optiuneMeniu) {
        throw new NotImplementedException();
    }

    @Override
    public OptiuneMeniu getOptiuneMeniu(int i) {
        throw new NotImplementedException();
    }

    @Override
    public void descriere(int level) {
        spatiereTaburi(level);
        System.out.println("Itemul cu numele "+this.numeItem+" pe nivelul ierarhic "+level);
    }

    @Override
    public void apasaMeniu(int level) {
        spatiereTaburi(level);
        System.out.println("Ati ales urmatorul item final:");
        this.descriere(level+1);
    }
    public void spatiereTaburi(int level){
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
    }
}
