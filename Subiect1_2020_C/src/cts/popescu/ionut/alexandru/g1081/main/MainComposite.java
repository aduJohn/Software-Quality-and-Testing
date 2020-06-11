package cts.popescu.ionut.alexandru.g1081.main;

import cts.popescu.ionut.alexandru.g1081.patternComposite.Client;
import cts.popescu.ionut.alexandru.g1081.patternComposite.GrupEmail;
import cts.popescu.ionut.alexandru.g1081.patternComposite.NodEmail;

public class MainComposite {
    public static void main(String[] args) {
        NodEmail nodEmail1 = new Client("Alex","1","alex@yahoo.com");
        NodEmail nodEmail2 = new Client("Vlad","2","vlad@yahoo.com");
        NodEmail nodEmail3 = new Client("Raluca","3","raluca@yahoo.com");
        NodEmail nodEmail4 = new Client("Ioana","4","ioana@yahoo.com");
        NodEmail nodEmail5 = new Client("Maria","5","maria@yahoo.com");
        NodEmail nodEmail6 = new Client("Gigel","6","gigel@yahoo.com");

        GrupEmail grupEmail = new GrupEmail("GrupI","G1","grup1@yahoo.com");
        NodEmail grupEmail2 = new GrupEmail("GrupII","G2","grup2@yahoo.com");
        NodEmail grupEmail3 = new GrupEmail("GrupIII","G3","grup3@yahoo.com");

        grupEmail.add(nodEmail1);
        grupEmail.add(grupEmail2);
        grupEmail2.add(nodEmail2);
        grupEmail2.add(nodEmail3);
        grupEmail2.add(nodEmail4);
        grupEmail2.add(grupEmail3);
        grupEmail3.add(nodEmail5);
        grupEmail3.add(nodEmail6);
        grupEmail.afisareStructura(0);
    }
}
