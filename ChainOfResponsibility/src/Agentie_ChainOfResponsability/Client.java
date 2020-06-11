package Agentie_ChainOfResponsability;

public class Client {
    private String email;
    private String numarTelefon;

    public Client(String email, String numarTelefon) {
        this.email = email;
        this.numarTelefon = numarTelefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }
}
