package classes.factory;

import classes.SupaAbstract;
import classes.SupaCiuperci;
import classes.SupaLegume;
import classes.SupaVita;

public class FactorySupa {
    public SupaAbstract createSupa(TipSupa tipSupa, String nume, int calorii) throws Exception {
        switch (tipSupa){
            case SUPA_DE_LEGUME:
                SupaLegume supaLegume = new SupaLegume(nume, calorii);
                return supaLegume;
            case SUPA_DE_VITA:
                SupaVita supaVita = new SupaVita(nume, calorii);
                return supaVita;
            case SUPA_DE_CIUPERCI:
                SupaCiuperci supaCiuperci = new SupaCiuperci(nume, calorii);
                return supaCiuperci;
            default:
                throw new Exception("Nu este");
        }
    }
}
