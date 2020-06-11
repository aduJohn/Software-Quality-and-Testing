package TH_Builder;

public class Product {
    private boolean hasSomething;
    private boolean isSomething;
    private String name;

    public Product() {
        this.hasSomething = false;
        this.isSomething = false;
        this.name= "Anonim";
    }

    public Product(boolean hasSomething, boolean isSomething, String name) {
        this.hasSomething = hasSomething;
        this.isSomething = isSomething;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "hasSomething=" + hasSomething +
                ", isSomething=" + isSomething +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean isHasSomething() {
        return hasSomething;
    }

    public void setHasSomething(boolean hasSomething) {
        this.hasSomething = hasSomething;
    }

    public boolean isSomething() {
        return isSomething;
    }

    public void setSomething(boolean something) {
        isSomething = something;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
