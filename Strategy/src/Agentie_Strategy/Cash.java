package Agentie_Strategy;

public class Cash implements IPlata {
    @Override
    public void plateste(float suma) {
        System.out.println("S-a platit suma de "+suma+" cu bani in mana.");
    }
}
