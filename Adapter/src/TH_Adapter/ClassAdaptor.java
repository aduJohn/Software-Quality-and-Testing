package TH_Adapter;

public class ClassAdaptor extends ProductA implements DifferentProductInterface {
    @Override
    public void productLook() {
        this.productDescription();
    }
}
