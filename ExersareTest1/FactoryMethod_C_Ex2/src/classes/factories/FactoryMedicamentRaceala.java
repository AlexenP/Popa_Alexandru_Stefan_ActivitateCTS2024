package classes.factories;

import classes.MedicamentAbstract;
import classes.MedicamentRaceala;

public class FactoryMedicamentRaceala implements FactoryInterface{
    @Override
    public MedicamentAbstract createMedicament(String denumire, int pret) {
        return new MedicamentRaceala(denumire, pret);
    }
}
