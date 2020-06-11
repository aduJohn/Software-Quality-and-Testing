package Agentie_Decorator;

public class DecoratorConcretPachetTuristic extends DecoratorAbstractPachetTuristic {
    public DecoratorConcretPachetTuristic(PachetTuristic pachetTuristic) {
        super(pachetTuristic);
    }

    @Override
    public void anularePachetRezervat() {
        System.out.println("Se anuleaza pachetul turistic");
    }
}
