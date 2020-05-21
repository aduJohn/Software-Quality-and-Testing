package Flyweight;

public class Client implements IClientBanca {
    private String nume;
    private String CNP;
    private String adresa;
    private String numarTelefon;

    public Client(String nume, String CNP, String adresa, String numarTelefon) {
        this.nume = nume;
        this.CNP = CNP;
        this.adresa = adresa;
        this.numarTelefon = numarTelefon;
    }

    @Override
    public void printeazaDetaliiClient(ContBancar contBancar) {
        System.out.println(this.toString());
        System.out.println(contBancar.toString());
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", CNP='" + CNP + '\'' +
                ", adresa='" + adresa + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                '}';
    }
}
