package TH_Facade;

public class Subsystem2 {
    private String name;

    public Subsystem2(String name) {
        this.name = name;
    }
    public void open(){
        System.out.println("Subsystem2 is opened!");
    }
    public void close(){
        System.out.println("Subsystem2 is closed!");
    }

}
