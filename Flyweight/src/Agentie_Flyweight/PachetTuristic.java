package Agentie_Flyweight;

public class PachetTuristic implements IPachetTuristic {
    private String codPachet;
    private String hotel;
    private String destinatie;
    private boolean micDejun;

    public PachetTuristic(String codPachet,String hotel, String destinatie, boolean micDejun) {
        this.codPachet = codPachet;
        this.hotel = hotel;
        this.destinatie = destinatie;
        this.micDejun = micDejun;
    }


    @Override
    public void descrierePachet(Optionale optionale) {
        System.out.println("Pachetul de baza "+this.toString());
        System.out.println("Pachetul optional "+this.toString());
    }

    @Override
    public String toString() {
        return "PachetTuristic{" +
                "codPachet='" + codPachet + '\'' +
                ", hotel='" + hotel + '\'' +
                ", destinatie='" + destinatie + '\'' +
                ", micDejun=" + micDejun +
                '}';
    }
}
