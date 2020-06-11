package cts.popescu.ionut.alexandru.g1081.patternDecorator;

import cts.popescu.ionut.alexandru.g1081.patternComposite.Client;
import cts.popescu.ionut.alexandru.g1081.patternComposite.IActiuniEmail;

import java.util.Date;

public class ClientDecorator extends ClientDecoratorAbstract {
    private String oraInregistrata;
    public ClientDecorator(IActiuniEmail client,String oraInregistrata) {
        super(client);
        this.oraInregistrata = oraInregistrata;
    }

    @Override
    public void trimiteEmail(IActiuniEmail destinatie, String subject) {
        super.trimiteEmail(destinatie, subject);
        System.out.println("Ora inregistrate "+this.oraInregistrata);
    }

}
