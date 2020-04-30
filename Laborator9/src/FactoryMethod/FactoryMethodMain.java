package FactoryMethod;

public class FactoryMethodMain {
    public static void afisarePersonalMedical(FabricaPersonalMedical fabricaPersonalMedical, String nume,long marca){
        PersonalMedical personalMedical = fabricaPersonalMedical.createType(nume,marca);
        personalMedical.descriere();
    }
    public static void main(String[] args) {
        afisarePersonalMedical(new FabricaAsistent(),"Ion",120);
        afisarePersonalMedical(new FabricaMedic(),"Alex",140);
        afisarePersonalMedical(new FabricaAnestezist(),"Ana",150);
    }
}
