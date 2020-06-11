package Agentie_ChainOfResponsability;

public abstract class Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }
    public abstract void trimiteNotificare(Client client,String mesaj);
}
