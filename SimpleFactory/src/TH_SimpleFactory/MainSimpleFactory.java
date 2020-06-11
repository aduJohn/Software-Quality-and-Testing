package TH_SimpleFactory;

public class MainSimpleFactory {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product productA = simpleFactory.createInstance(ProductType.A);
        Product productB = simpleFactory.createInstance(ProductType.B);
        productA.productDescription();
        productB.productDescription();
    }
}
