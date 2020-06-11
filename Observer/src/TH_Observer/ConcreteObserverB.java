package TH_Observer;

public class ConcreteObserverB implements Observer {
    @Override
    public void update() {
        System.out.println("OBSERVER B HAS BEEN UPDATED AND NOTIFIED!");
    }
}
