package Agentie_ChainOfResponsability;

public class NotificatorSMS extends Handler {
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if (client.getNumarTelefon()!=null){
            System.out.println("Clientul a primit prin SMS mesajul:");
            System.out.println(mesaj);
        }else{
            if(getNextHandler()!=null)
                this.getNextHandler().trimiteNotificare(client,mesaj);
        }
    }
}
