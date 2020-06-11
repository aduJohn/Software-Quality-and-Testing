package TH_State;

public class NormalState implements State {
    @Override
    public void handle() {
        System.out.println("Handle in normal state");
    }
}
