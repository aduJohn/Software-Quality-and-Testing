package Agentie_ChainOfResponsability;

public class NotificatorManager extends Handler {
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        System.out.println("Clientul nu are email si SMS");
        System.out.println("Se contacteaza managerul");
    }
}
