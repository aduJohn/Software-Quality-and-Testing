package TH_Decorator;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void newOperation() {
        System.out.println("The implementation for the new operation");
    }
}
