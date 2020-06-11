package TH_Prototype;

public abstract class Product implements Cloneable {
    protected double pret;
    protected String name;
    public Product(){
    }

    public Product(double pret,String name) throws InterruptedException {
        this.pret = pret;
        this.name = name;
        Thread.currentThread().sleep(2000);
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected abstract Object clone();

    @Override
    public String toString() {
        return "Product{" +
                "pret=" + pret +
                ", name='" + name + '\'' +
                '}';
    }
}
