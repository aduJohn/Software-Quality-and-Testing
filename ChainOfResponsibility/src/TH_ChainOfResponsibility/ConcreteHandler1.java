package TH_ChainOfResponsibility;

public class ConcreteHandler1 extends Handler {

    @Override
    public void handle(boolean valability) {
        if(valability){
            System.out.println("Available");
        }else{
            this.getNextHandler().handle(valability);
        }
    }
}
