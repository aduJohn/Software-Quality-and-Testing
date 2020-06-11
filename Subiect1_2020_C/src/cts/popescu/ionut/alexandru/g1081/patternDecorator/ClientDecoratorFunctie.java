package cts.popescu.ionut.alexandru.g1081.patternDecorator;

import cts.popescu.ionut.alexandru.g1081.patternComposite.IActiuniEmail;

import java.util.Date;

public class ClientDecoratorFunctie extends ClientDecorator {

    public ClientDecoratorFunctie(IActiuniEmail client, String oraInregistrata) {
        super(client, oraInregistrata);
    }

    @Override
    public void creareEmailDraft(String subject, int prioritate) {
        System.out.println("Functie modificata");
    }
}
