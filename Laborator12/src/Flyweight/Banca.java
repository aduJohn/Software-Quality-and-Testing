package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Banca {
    private static Map<String, IClientBanca> clienti = new HashMap<String, IClientBanca>();

    public static IClientBanca getOrCreateClient(String nume,String CNP,String adresa,String numarTelefon){
        IClientBanca clientBanca = clienti.get(CNP);
        if(clientBanca==null){
            clientBanca = new Client(nume,CNP,adresa,numarTelefon);
            clienti.put(CNP,clientBanca);
        }
        return clientBanca;
    }

    public static int dimensiuneMap(){
        return clienti.size();
    }
}
