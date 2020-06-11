package TH_Command;

public class ConcreteReceiver implements Receiver {

    @Override
    public void doAction1() {
        System.out.println("I did something");
    }

    @Override
    public void doAction2() {
        System.out.println("I did something else");
    }
}
