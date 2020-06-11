package TH_Facade;

public class Subsystem1 {
    private String name;

    public Subsystem1(String name) {
        this.name = name;
    }
    public void open(){
        System.out.println("Subsystem1 is opened!");
    }
    public void close(){
        System.out.println("Subsystem1 is closed!");
    }
}
