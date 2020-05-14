package Composite;

public class MainComposite {
    public static void main(String[] args) {
        Agentie agentie = new Agentie("Ion");
        Filiala filiala = new Filiala("Vlad");
        Agentie agentie2 = new Agentie("Alex");
        Filiala filiala2 = new Filiala("Abdul");

        System.out.println("Descriere 1");
        agentie.adaugaSucursala(filiala);
        agentie.adaugaSucursala(agentie2);
        agentie2.adaugaSucursala(filiala2);

        agentie.descriereSucursala();

        System.out.println("Descriere2");
        agentie2.stergeSucursala(filiala2);
        agentie.adaugaSucursala(filiala2);

        agentie.descriereSucursala();
    }
}
