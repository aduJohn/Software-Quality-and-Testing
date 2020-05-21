package Strategy;

public class MainStrategy {
    public static void main(String[] args) {
        Client client = new Client();
        client.setMetodaPlata(new Card());

        client.platesteReteta(100);
    }
}
