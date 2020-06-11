package TH_State;

public class ConcreteState2 implements State {
    @Override
    public void handle() {
        System.out.println("Handle in state 2");
    }
}
