package TH_ChainOfResponsibility;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handle(boolean valability) {
        System.out.println("Non-available");
    }
}
