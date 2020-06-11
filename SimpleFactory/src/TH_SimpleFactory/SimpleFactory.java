package TH_SimpleFactory;

public class SimpleFactory {
    public Product createInstance(ProductType productType){
        switch (productType){
            case A:
                return new ProductA();
            case B:
                return new ProductB();
            default:
                return null;
        }
    }
}
