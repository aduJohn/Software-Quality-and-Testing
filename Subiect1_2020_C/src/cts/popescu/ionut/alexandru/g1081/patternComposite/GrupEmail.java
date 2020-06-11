package cts.popescu.ionut.alexandru.g1081.patternComposite;

import java.util.ArrayList;
import java.util.List;

public class GrupEmail extends NodEmail {
    private List<NodEmail> emails;

    public GrupEmail(String nume, String id, String email) {
        super(nume, id, email);
        this.emails = new ArrayList<>();
    }
    public void afisareTabulara(int level)
    {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
    }
    @Override
    public void afisareStructura(int level) {
        afisareTabulara(level);
        System.out.println("Afisare grup email pe nivelul "+level);
        for (NodEmail nodEmail:emails) {
            nodEmail.afisareStructura(level+1);
        }
    }

    @Override
    public void add(NodEmail nodEmail) {
        this.emails.add(nodEmail);
    }

    @Override
    public void remove(NodEmail nodEmail) {
        this.emails.remove(nodEmail);
    }

    @Override
    public NodEmail getChild(int i) {
        return emails.get(i);
    }
}
