package Agentie_Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Newsletter {
    private List<IClient> clientList;

    public Newsletter() {
        this.clientList = new ArrayList<>();
    }

    public void adaugaClient(IClient client){
        clientList.add(client);
    }
    public void stergeClient(IClient client){
        clientList.remove(client);
    }
    public void notificareClienti(String mesaj){
        for (IClient client:clientList) {
            client.notificareOferta(mesaj);
        }
    }
}
