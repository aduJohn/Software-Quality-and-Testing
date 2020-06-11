package Agentie_Command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<IComanda> comenzi;
    private String name;

    public Operator(String name) {
        this.name = name;
        this.comenzi = new ArrayList<>();
    }
    public void preiaComanda(IComanda comanda){
        comenzi.add(comanda);
    }
    public void executaComanda(){
        if(comenzi.size()>0) {
            System.out.println("Operatorul " + this.name + " executa prima comanda din lista");
            comenzi.get(0).executaComanada();
            comenzi.remove(0);
        }else{
            System.out.println("Nu exista nici o comanda de executat");
        }
    }
    public void executaToateComenzile(){
        if(comenzi.size()>0) {
            System.out.println("Operatorul " + this.name + " executa toate comenzile din lista");
            for (IComanda comanda:comenzi) {
                comanda.executaComanada();
            }
            comenzi.clear();
        }else{
            System.out.println("Nu exista nici o comanda de executat");
        }
    }
}
