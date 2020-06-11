package TH_Prototype;

public class ProductA extends Product {
    public ProductA() {
    }

    public ProductA(double pret,String name) throws InterruptedException {
        super(pret,name);
        System.out.println("Implementing product A");
    }

    @Override
    protected Object clone() {
        ProductA clona = null;
        clona = new ProductA();
        clona.pret = this.pret;
        clona.name = this.name;
        return clona;
    }
}
