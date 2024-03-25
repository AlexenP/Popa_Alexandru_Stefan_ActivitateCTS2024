package classes.factories;

import classes.SupaAbstract;
import classes.SupaCiuperci;

public class FactorySupaCiuperci implements InterfaceFactory{
    @Override
    public SupaAbstract createSupa(String nume, int calorii) {
        return new SupaCiuperci(nume, calorii);
    }
}
