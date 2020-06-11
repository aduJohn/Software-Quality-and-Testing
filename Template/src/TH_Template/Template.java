package TH_Template;

public abstract class Template {
    public abstract void doSomething();
    public abstract void doSomething2();
    public abstract void doSomething3();
    public abstract void doSomething4();
    public final void executeAlgorithm(){
        doSomething();
        doSomething2();
        doSomething3();
        doSomething4();
    }
}
