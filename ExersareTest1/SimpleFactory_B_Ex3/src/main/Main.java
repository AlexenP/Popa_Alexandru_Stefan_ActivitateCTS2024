package main;

import classes.SupaAbstract;
import classes.factory.FactorySupa;
import classes.factory.TipSupa;

// Restaurantul servește mai multe tipuri de supe: supă de legume, supă de ciuperci, supă de vită, etc. Să se
// implementeze modulul care permite realizarea de obiecte din familia supelor. Tipurile de supă sunt reținute
// în cadrul unui enum
public class Main {
    public static void main(String[] args) {
        FactorySupa factorySupa = new FactorySupa();
        try{
            SupaAbstract supaCiuperci = factorySupa.createSupa(TipSupa.SUPA_DE_CIUPERCI,"Ciupercuta",200);
            SupaAbstract supaLegume =factorySupa.createSupa(TipSupa.SUPA_DE_LEGUME,"Legume in supa",300);
            SupaAbstract supaVita =factorySupa.createSupa(TipSupa.SUPA_DE_VITA,"Vita mena",350);
            SupaAbstract supaVita2 =factorySupa.createSupa(TipSupa.SUPA_DE_VITA,"Vita dona",330);

            supaCiuperci.descriere();
            supaLegume.descriere();
            supaVita.descriere();
            supaVita2.descriere();
        }catch (Exception e){
            throw new RuntimeException();
        }


    }
}