package classes.factories;

import classes.SupaAbstract;

public interface InterfaceFactory {
    public SupaAbstract createSupa(String nume, int calorii);
}
