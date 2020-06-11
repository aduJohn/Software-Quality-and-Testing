package TH_Prototype;

public class MainPrototype {
    public static void main(String[] args) {
        System.out.println("Initializing products:");
        try {
            Product productA = new ProductA(300,"Something");
            Product productB = new ProductB(100,"Else");
            System.out.println(productA);
            System.out.println(productB);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Using prototypes");
        Product productPA = PrototypeProduct.getPrototype("Branza");
        Product productPB = PrototypeProduct.getPrototype("Paine");
        Product productPA2 = PrototypeProduct.getPrototype("Branza");
        Product productPB2 = PrototypeProduct.getPrototype("Paine");
        System.out.println(productPA);
        System.out.println(productPB);
        System.out.println(productPA2);
        System.out.println(productPB2);
    }
}
