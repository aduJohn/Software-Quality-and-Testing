package TH_Prototype;

import java.util.HashMap;

public class PrototypeProduct {
    private static HashMap<String,Product> prototypes = new HashMap<>();
    static {

        System.out.println("Initialzing prototypes...");

        try {
            ProductA producAPrototype = new ProductA(25,"Branza");
            ProductB producBPrototype = new ProductB(3.5,"Paine");
            prototypes.put("Branza",producAPrototype);
            prototypes.put("Paine",producBPrototype);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static Product getPrototype(String name){
        Product productClone = null;
        Product prototype = prototypes.get(name);
        if(prototype!=null){
            productClone = (Product) prototype.clone();
        }
        return productClone;
    }
}
