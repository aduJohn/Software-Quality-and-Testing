package DecoratorCard;

public class MainDecorator {
    public static void main(String[] args) {
        Card card = new Card();
        card.efectuarePlataOnline();
        card.efectuarePlataNormala();

        DecoratorCardConcret cardDecorat = new DecoratorCardConcret(card);
        cardDecorat.efectuarePlataContactless();
    }
}
