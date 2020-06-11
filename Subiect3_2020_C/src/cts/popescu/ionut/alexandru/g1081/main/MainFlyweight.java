package cts.popescu.ionut.alexandru.g1081.main;

import cts.popescu.ionut.alexandru.g1081.patternFlyweight.Disciplina;
import cts.popescu.ionut.alexandru.g1081.patternFlyweight.DisciplinaFlyweightFactory;
import cts.popescu.ionut.alexandru.g1081.patternFlyweight.Student;

public class MainFlyweight {
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina("CTS",5);
        Disciplina disciplina2 = new Disciplina("Pachete Software",4);
        Disciplina disciplina3 = new Disciplina("Proiectare sisteme",4);

        DisciplinaFlyweightFactory factory = new DisciplinaFlyweightFactory();

        Student student1 = new Student("Mihai");
        Student student2 = new Student("Andrei");

        student1.sustineExamen(factory.getDisciplina("CTS",5).getNume());
        student2.sustineExamen(factory.getDisciplina("CTS",5).getNume());

        student1.sustineExamen(factory.getDisciplina("Pachete Software",4).getNume());
        student2.sustineExamen(factory.getDisciplina("Pachete Software",4).getNume());

        student1.sustineExamen(factory.getDisciplina("Proiectare sisteme",4).getNume());
        student2.sustineExamen(factory.getDisciplina("Proiectare sisteme",4).getNume());

    }
}
