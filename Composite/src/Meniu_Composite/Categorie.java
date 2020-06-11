package Meniu_Composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Categorie implements OptiuneMeniu {
    private List<OptiuneMeniu> optiuni;
    private String numeCategorie;

    public Categorie(String numeCategorie) {
        this.numeCategorie = numeCategorie;
        optiuni = new ArrayList<>();
    }

    @Override
    public void adaugaOptiuneMeniu(OptiuneMeniu optiuneMeniu) {
        optiuni.add(optiuneMeniu);
    }

    @Override
    public void stergeOptiuneMeniu(OptiuneMeniu optiuneMeniu) {
        optiuni.remove(optiuneMeniu);
    }

    @Override
    public OptiuneMeniu getOptiuneMeniu(int i) {
        return optiuni.get(i);
    }

    @Override
    public void descriere(int level) {
        spatiereTaburi(level);
        System.out.println("Categoria cu numele "+this.numeCategorie+" pe nivelul ierarhic "+level);
    }

    @Override
    public void apasaMeniu(int level) {
        afiseazaOptiuni(level);
        System.out.println("Introduceti numarul optiunii alese:");
        Scanner in = new Scanner(System.in);
        int numarOptiune = in.nextInt();
        if(numarOptiune<0 || numarOptiune>optiuni.size()){
            System.out.println("Nu ati selectat o optiune corecta, va rugam incercati din nou");
        }else{
            optiuni.get(numarOptiune).apasaMeniu(level+1);
        }
    }
    public void spatiereTaburi(int level){
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
    }
    public void afiseazaOptiuni(int level){
        spatiereTaburi(level);
        System.out.println("Ati selectat optiunea din meniu cu numele "+this.numeCategorie);
        spatiereTaburi(level);
        System.out.println("Din acest punct puteti sa alegeti urmatoarele optiuni:");
        for (OptiuneMeniu optiuneMeniu:optiuni) {
            optiuneMeniu.descriere(level+1);
        }
        spatiereTaburi(level);
    }
}
