package DecoratorCard;

public class Card implements CardAbstract {

    @Override
    public void efectuarePlataOnline() {
        System.out.println("S-a efectuat o plata online");
    }

    @Override
    public void efectuarePlataNormala() {
        System.out.println("S-a efectuat o plata normala");
    }
}
