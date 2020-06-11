package TH_Flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String,IFlyweight> flyweights;

    public FlyweightFactory() {
        this.flyweights = new HashMap<String,IFlyweight>();
    }
    public IFlyweight getFlyweight(String code,String concreteState1,String concreteState2){
        IFlyweight flyweight = flyweights.get(code);
        if(flyweight == null){
            flyweight = new ConcreteFlyweight(code,concreteState1,concreteState2);
            flyweights.put(code,flyweight);
        }
        return flyweight;
    }
    public int getNumberFlyweights(){
        return flyweights.size();
    }
}
