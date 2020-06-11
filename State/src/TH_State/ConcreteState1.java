package TH_State;

public class ConcreteState1 implements State {
    @Override
    public void handle() {
        System.out.println("Handle in state1");
    }
}
