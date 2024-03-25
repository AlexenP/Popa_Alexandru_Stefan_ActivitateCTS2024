package classes.factories;

import classes.MedicamentAbstract;
import classes.MedicamentDurere;

public class FactoryMedicamentDurere implements FactoryInterface{
    @Override
    public MedicamentAbstract createMedicament(String denumire, int pret) {
        return new MedicamentDurere(denumire, pret);
    }
}
