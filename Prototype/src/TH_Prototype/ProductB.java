package TH_Prototype;

public class ProductB extends Product {
    public ProductB(){
    }
    public ProductB(double pret,String name) throws InterruptedException {
        super(pret,name);
        System.out.println("Implementing product B");
    }

    @Override
    protected Object clone() {
        ProductB clona = null;
        clona = new ProductB();
        clona.pret = this.pret;
        clona.name = this.name;
        return clona;
    }
}
