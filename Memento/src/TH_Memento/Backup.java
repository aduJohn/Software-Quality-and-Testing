package TH_Memento;

import java.util.ArrayList;
import java.util.List;

public class Backup {
    private List<Memento> listaBackup;

    public Backup() {
        listaBackup = new ArrayList<>();
    }
    public void addBackup(Memento memento){
        listaBackup.add(memento);
    }
    public Memento getMemento(int position){
        if(position < listaBackup.size() && position>=0){
            return listaBackup.get(position);
        }else{
            return null;
        }
    }
}
