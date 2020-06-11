package TH_Flyweight;

public class ConcreteFlyweight implements IFlyweight {
    private String id;
    private String concreteState1;
    private String concreteState2;

    public ConcreteFlyweight(String id, String concreteState1, String concreteState2) {
        this.id = id;
        this.concreteState1 = concreteState1;
        this.concreteState2 = concreteState2;
    }

    @Override
    public void operation(ExtrinsicState extrinsicState) {
        System.out.println("Concrete state "+this.toString());
        System.out.println("Extrinsic state "+extrinsicState.toString());
    }

    @Override
    public String toString() {
        return "ConcreteFlyweight{" +
                "id='" + id + '\'' +
                ", concreteState1='" + concreteState1 + '\'' +
                ", concreteState2='" + concreteState2 + '\'' +
                '}';
    }
}
