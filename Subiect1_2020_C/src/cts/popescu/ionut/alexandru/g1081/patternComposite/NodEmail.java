package cts.popescu.ionut.alexandru.g1081.patternComposite;

public abstract class NodEmail {
    protected String nume;
    protected String id;
    protected String email;

    public NodEmail(String nume, String id, String email) {
        this.nume = nume;
        this.id = id;
        this.email = email;
    }
    public abstract void afisareStructura(int level);
    public abstract void add(NodEmail nodEmail);
    public abstract void remove(NodEmail nodEmail);
    public abstract NodEmail getChild(int i);
}
