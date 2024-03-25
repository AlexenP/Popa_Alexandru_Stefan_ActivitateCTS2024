package classes.factories;

import classes.SupaAbstract;
import classes.SupaLegume;

public class FactorySupaLegume implements InterfaceFactory{
    @Override
    public SupaAbstract createSupa(String nume, int calorii) {
        return new SupaLegume(nume, calorii);
    }
}
