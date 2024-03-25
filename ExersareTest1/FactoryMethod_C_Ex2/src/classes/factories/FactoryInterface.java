package classes.factories;

import classes.MedicamentAbstract;

public interface FactoryInterface {
    public MedicamentAbstract createMedicament(String denumire, int pret);
}
