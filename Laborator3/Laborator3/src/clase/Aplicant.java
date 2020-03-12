package clase;

public class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nr_proiecte;
    protected String[] denumireProiect;

    protected int primaProiect;
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void statut() {
        if (punctaj > 80)
            System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
        else
            System.out.println("Aplicantul " + nume + " " + prenume + " nu a fost acceptat.");
    }

    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }


    public Aplicant() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nr_proiecte = nr_proiecte;
        this.denumireProiect = denumireProiect;
    }

    public int getNrProiecte() {
        return nr_proiecte;
    }

    public void setNrProiecte(int nr_proiecte, String[] denumireProiect) {
        this.nr_proiecte = nr_proiecte;

        this.denumireProiect = denumireProiect;
    }

    public int finantare() {
        System.out.println(this.getClass().getName().replace("clase.", "") + ": " + getNume() + " "
                + getPrenume() + " primeste " + this.primaProiect + " pe proiect.");

        return primaProiect;
    }
}
