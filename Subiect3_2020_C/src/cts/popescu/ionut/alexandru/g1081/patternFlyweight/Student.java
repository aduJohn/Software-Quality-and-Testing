package cts.popescu.ionut.alexandru.g1081.patternFlyweight;

public class Student implements IStudent {
    private String nume;

    public Student(String nume) {
        this.nume = nume;
    }

    @Override
    public void sustineExamen(String displina) {
        System.out.println("Studentul "+nume+" sustine examenul la disciplina "+displina);
    }
}
