package TH_Builder;

public class BuilderProduct implements Builder{
    private Product product ;

    public BuilderProduct() {
        this.product = new Product();
    }

    @Override
    public Product build() {
        return this.product;
    }

    public Product setHasSomething(boolean hasSomething) {
        product.setHasSomething(hasSomething);
        return this.product;
    }


    public Product setSomething(boolean something) {
        product.setSomething(something);
        return this.product;
    }
}
