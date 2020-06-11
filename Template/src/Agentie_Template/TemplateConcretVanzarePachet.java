package Agentie_Template;

public class TemplateConcretVanzarePachet extends TemplateVanzarePachet {
    @Override
    public void cautareCazare() {
        System.out.println("Cautam cazare...");
    }

    @Override
    public void cautareTransport() {
        System.out.println("Cautam transport...");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("Rezervam pachjet...");
    }

    @Override
    public void realizarePlata() {
        System.out.println("Efectuarea platii...");
    }
}
