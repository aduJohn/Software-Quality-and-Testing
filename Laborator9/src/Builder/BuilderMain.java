package Builder;

public class BuilderMain {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ion",false,true,true,false);
        System.out.println(pacient.toString());

        Pacient pacientBuilt = new PacientBuilderConcret().setNume("Ion").setMicDejunInclus(true).build();
        System.out.println(pacientBuilt.toString());
    }
}
