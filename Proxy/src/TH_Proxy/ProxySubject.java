package TH_Proxy;

public class ProxySubject implements Subject {
    private RealSubject subject;

    public ProxySubject(RealSubject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        if(subject.getAge()>18){
            System.out.println("A request from "+ subject.getName()+ " with the age "+subject.getAge());
        }else{
            System.out.println("The subject doesn't have the age to do this reuqest");
        }
    }
}
