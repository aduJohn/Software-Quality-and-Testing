package Agentie_Strategy;

public class Paypal implements IPlata {
    @Override
    public void plateste(float suma) {
        System.out.println("S-a platit suma de "+suma+" prin PayPal.");
    }
}
