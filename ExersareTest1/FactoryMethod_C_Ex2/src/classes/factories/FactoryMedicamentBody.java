package classes.factories;

import classes.MedicamentAbstract;
import classes.MedicamentBody;

public class FactoryMedicamentBody implements FactoryInterface{
    @Override
    public MedicamentAbstract createMedicament(String denumire, int pret) {
        return new MedicamentBody(denumire, pret);
    }
}
