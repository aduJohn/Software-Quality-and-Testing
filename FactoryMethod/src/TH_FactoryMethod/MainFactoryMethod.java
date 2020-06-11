package TH_FactoryMethod;

public class MainFactoryMethod {
    public static void printProducts(Factory factory){
        Product product = factory.createProduct();
        product.productDescription();
    }
    public static void main(String[] args) {
        FactoryProductA factoryProductA = new FactoryProductA();
        FactoryProductB factoryProductB = new FactoryProductB();
        printProducts(factoryProductA);
        printProducts(factoryProductB);
    }
}
