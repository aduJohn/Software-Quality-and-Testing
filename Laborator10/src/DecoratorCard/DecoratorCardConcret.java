package DecoratorCard;

public class DecoratorCardConcret extends DecoratorCardAbstract {

    public DecoratorCardConcret(CardAbstract cardAbstract) {
        super(cardAbstract);
    }

    @Override
    public void efectuarePlataContactless() {
        System.out.println("S-a efectuat o plate contactless");
    }
}
