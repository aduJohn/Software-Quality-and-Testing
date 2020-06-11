package TH_FactoryMethod;

public class FactoryProductB implements Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
