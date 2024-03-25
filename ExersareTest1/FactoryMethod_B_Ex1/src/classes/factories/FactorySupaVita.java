package classes.factories;

import classes.SupaAbstract;
import classes.SupaVita;

public class FactorySupaVita implements InterfaceFactory{
    @Override
    public SupaAbstract createSupa(String nume, int calorii) {
        return new SupaVita(nume, calorii);
    }
}
