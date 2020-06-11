package TH_Facade;

public class SystemFacade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;
    private Subsystem3 subsystem3;

    public SystemFacade(Subsystem1 subsystem1, Subsystem2 subsystem2, Subsystem3 subsystem3) {
        this.subsystem1 = subsystem1;
        this.subsystem2 = subsystem2;
        this.subsystem3 = subsystem3;
    }
    public void openTheWholeSistem(){
        this.subsystem1.open();
        this.subsystem2.open();
        this.subsystem3.open();
    }
    public void closeTheWholeSistem(){
        this.subsystem1.close();
        this.subsystem2.close();
        this.subsystem3.close();
    }
}
