package FactoryMethod;

import com.sun.corba.se.impl.orb.PropertyOnlyDataCollector;

public interface FabricaPersonalMedical {
    public PersonalMedical createType(String nume, long marca);
}
