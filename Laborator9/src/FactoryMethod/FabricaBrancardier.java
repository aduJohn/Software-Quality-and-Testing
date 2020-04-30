package FactoryMethod;

public class FabricaBrancardier implements FabricaPersonalMedical {
    @Override
    public PersonalMedical createType(String nume, long marca) {
        return new Brancardier(nume,marca);
    }
}
