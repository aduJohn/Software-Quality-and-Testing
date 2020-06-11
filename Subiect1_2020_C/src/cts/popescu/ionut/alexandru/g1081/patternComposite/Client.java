package cts.popescu.ionut.alexandru.g1081.patternComposite;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;

public class Client extends NodEmail implements IActiuniEmail {
    public Client(String nume, String id, String email) {
        super(nume, id, email);
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
        System.out.println("Afisare email pe nivelul "+level);
        afisareTabulara(level);
        System.out.println("Nume "+nume+" email: "+email);
    }

    @Override
    public void trimiteEmail(IActiuniEmail destinatie, String subject) {
        System.out.println("Trimite email");
    }

    @Override
    public void creareEmailDraft(String subject, int prioritate) {
        System.out.println("Creare email draft");
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void trimiteEveniment(Date dataEveniment, IActiuniEmail destinatie, String subject) {
        System.out.println("Email nou cu subiectul :"+subject);
    }

    @Override
    public void add(NodEmail nodEmail) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(NodEmail nodEmail) {
        throw new NotImplementedException();
    }

    @Override
    public NodEmail getChild(int i) {
        throw new NotImplementedException();
    }
}
