package SimpleFactory;

public class FabricaPersonalMedical {
    public PersonalMedical createType(TipPersonal tipPersonal,String nume,long marca){
        switch (tipPersonal){
            case Medic:
                return new Medic(nume,marca);
            case Asistent:
                return new Asistent(nume,marca);
            case Brancardier:
                return new Brancardier(nume,marca);
            default:
                return null;
        }
    }
}
