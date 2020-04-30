package FactoryMethod;

public class FabricaAsistent implements FabricaPersonalMedical {
    @Override
    public PersonalMedical createType(String nume, long marca) {
        return new Asistent(nume,marca);
    }
}
