package TH_Decorator;

public class ConcreteComponent implements Component {
    private String name;

    public ConcreteComponent(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Implementation for the concrete component");
    }
}
