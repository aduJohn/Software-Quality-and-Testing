package Agentie_Facade;

public class Hotel {
    private String nume;

    public Hotel(String nume) {
        this.nume = nume;
    }
    public void rezervaCameraHotel(){
        System.out.println("S-a rezervat o camera de hotel la "+this.nume);
    }
}
