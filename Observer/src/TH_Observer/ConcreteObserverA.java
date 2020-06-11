package TH_Observer;

public class ConcreteObserverA implements Observer {
    @Override
    public void update() {
        System.out.println("OBSERVER A HAS BEEN UPDATED AND NOTIFIED!");
    }
}
