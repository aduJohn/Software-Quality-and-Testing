package TH_FactoryMethod;

public class FactoryProductA implements Factory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
