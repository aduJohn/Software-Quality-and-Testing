package TH_ChainOfResponsibility;

public abstract class Handler {
    private Handler nextHandler;
    public Handler getNextHandler(){
        return nextHandler;
    }
    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }
    public abstract void handle(boolean valability);
}
