package SimpleFactory;

public class SimpleFactoryMain {
    public static void main(String[] args) {
        FabricaPersonalMedical fabricaPersonalMedical = new FabricaPersonalMedical();
        PersonalMedical medic = fabricaPersonalMedical.createType(TipPersonal.Medic,"Popescu",20201);
        PersonalMedical asistent = fabricaPersonalMedical.createType(TipPersonal.Asistent,"Enescu",20202);

        medic.descriere();
        asistent.descriere();
    }
}
