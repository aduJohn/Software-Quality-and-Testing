package FactoryMethod;

public class FabricaAnestezist implements FabricaPersonalMedical {
    @Override
    public PersonalMedical createType(String nume, long marca) {
        return new Anestezist(nume,marca);
    }
}
