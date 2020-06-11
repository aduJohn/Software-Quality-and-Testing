package TH_Proxy;

public class RealSubject implements Subject {
    private String name;
    private int age;

    public RealSubject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void request() {
        System.out.println("A request from "+name+ " with the age "+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
