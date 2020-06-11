package TH_Facade;

public class Subsystem3 {
    private String name;

    public Subsystem3(String name) {
        this.name = name;
    }
    public void open(){
        System.out.println("Subsystem3 is opened!");
    }
    public void close(){
        System.out.println("Subsystem3 is closed!");
    }
}
