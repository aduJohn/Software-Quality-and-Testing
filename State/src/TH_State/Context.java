package TH_State;

public class Context {
    private State currentState;

    public Context() {
        this.currentState = new ConcreteState1();
    }

    public void setCurrentState(States state){
        switch (state){
            case STATE1:
                this.currentState = new ConcreteState1();
            case STATE2:
                this.currentState = new ConcreteState2();
            default:
                this.currentState = new NormalState();
        }
    }

    public void getCurrentState() {
        currentState.handle();
    }
}
