package cts.popescu.ionut.alexandru.g1081.patternDecorator;

import cts.popescu.ionut.alexandru.g1081.patternComposite.IActiuniEmail;

import java.util.Date;

public abstract class ClientDecoratorAbstract implements IActiuniEmail {
    private IActiuniEmail client;

    public ClientDecoratorAbstract(IActiuniEmail client) {
        this.client = client;
    }

    @Override
    public void trimiteEmail(IActiuniEmail destinatie, String subject) {
        client.trimiteEmail(destinatie,subject);
    }

    @Override
    public void creareEmailDraft(String subject, int prioritate) {
        client.creareEmailDraft(subject,prioritate);
    }

    @Override
    public String getEmail() {
        return client.getEmail();
    }

    @Override
    public void trimiteEveniment(Date dataEveniment, IActiuniEmail destinatie, String subject) {
        client.trimiteEveniment(dataEveniment,destinatie,subject);
    }

}