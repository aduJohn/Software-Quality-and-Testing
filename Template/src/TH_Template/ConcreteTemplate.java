package TH_Template;

public class ConcreteTemplate extends Template {
    @Override
    public void doSomething() {
        System.out.println("I did something");
    }

    @Override
    public void doSomething2() {
        System.out.println("I did something x2");
    }

    @Override
    public void doSomething3() {
        System.out.println("I did something x3");
    }

    @Override
    public void doSomething4() {
        System.out.println("I did something x4");
    }
}
