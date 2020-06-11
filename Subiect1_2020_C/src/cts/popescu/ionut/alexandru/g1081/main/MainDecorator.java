package cts.popescu.ionut.alexandru.g1081.main;

import cts.popescu.ionut.alexandru.g1081.patternComposite.Client;
import cts.popescu.ionut.alexandru.g1081.patternComposite.IActiuniEmail;
import cts.popescu.ionut.alexandru.g1081.patternDecorator.ClientDecorator;
import cts.popescu.ionut.alexandru.g1081.patternDecorator.ClientDecoratorAbstract;
import cts.popescu.ionut.alexandru.g1081.patternDecorator.ClientDecoratorFunctie;

public class MainDecorator {
    public static void main(String[] args) {
        IActiuniEmail client = new Client("Alex","1","alex@yahoo.com");
        ClientDecoratorAbstract clientDecoratorAbstract = new ClientDecorator(client,"10:30AM");
        ClientDecoratorFunctie clientDecoratorFunctie = new ClientDecoratorFunctie(clientDecoratorAbstract,"10:30PM");
    }
}
