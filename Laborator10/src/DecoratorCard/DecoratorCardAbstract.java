package DecoratorCard;

import AdapterBanca.InterfataCredit;

public abstract class DecoratorCardAbstract implements CardAbstract {

    private CardAbstract cardAbstract;

    public DecoratorCardAbstract(CardAbstract cardAbstract) {
        this.cardAbstract = cardAbstract;
    }

    @Override
    public void efectuarePlataOnline() {
        cardAbstract.efectuarePlataOnline();
    }
    @Override
    public void efectuarePlataNormala() {
        cardAbstract.efectuarePlataNormala();
    }

    public abstract void efectuarePlataContactless();
}
