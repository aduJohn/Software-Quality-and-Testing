package TH_Adapter;

public class ObjectAdaptor implements DifferentProductInterface {
    private ProductA adaptee;
    @Override
    public void productLook() {
        adaptee.productDescription();
    }
}
