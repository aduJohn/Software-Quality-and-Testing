package Agentie_ChainOfResponsability;

public class MainChainOfResponsability {
    public static void main(String[] args) {
        Client client1 = new Client(null,"123");
        NotificatorManager notificatorManager = new NotificatorManager();
        NotificatorEmail notificatorEmail = new NotificatorEmail();
        notificatorEmail.setNextHandler(notificatorManager);
        NotificatorSMS notificatorSMS = new NotificatorSMS();
        notificatorSMS.setNextHandler(notificatorEmail);
        notificatorSMS.trimiteNotificare(client1,"Ce faci?");
    }
}
