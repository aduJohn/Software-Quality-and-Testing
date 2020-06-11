package cts.popescu.ionut.alexandru.g1081.patternFlyweight;

import java.util.HashMap;

public class DisciplinaFlyweightFactory {
    private HashMap<String,Disciplina> discipline;

    public DisciplinaFlyweightFactory() {
        this.discipline = new HashMap<String, Disciplina>();
    }

    public Disciplina getDisciplina(String nume,int numarCredite){
        Disciplina disciplina = discipline.get(nume);
        if(disciplina==null){
            disciplina = new Disciplina(nume,numarCredite);
            discipline.put(nume,disciplina);
        }
        return disciplina;
    }
    public int getNumarDiscipline(){
        return this.discipline.size();
    }
}
