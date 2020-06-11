package Agentie_ChainOfResponsability;

public class NotificatorEmail extends Handler {
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(client.getEmail()!=null){
            System.out.println("Clientul a primit prin Email mesajul:");
            System.out.println(mesaj);
        }else{
            this.getNextHandler().trimiteNotificare(client,mesaj);
        }
    }
}
