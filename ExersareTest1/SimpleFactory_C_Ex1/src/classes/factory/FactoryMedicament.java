package classes.factory;

import classes.MedicamentAbstract;
import classes.MedicamentBody;
import classes.MedicamentDurere;
import classes.MedicamentRaceala;

public class FactoryMedicament {
    public MedicamentAbstract createMedicament(TipMedicament tipMedicament, String denumire, int pret) throws Exception {
        switch (tipMedicament){
            case BODY:
                MedicamentBody medicamentBody = new MedicamentBody(denumire,pret);
                return medicamentBody;
            case DURERE:
                MedicamentDurere medicamentDurere = new MedicamentDurere(denumire,pret);
                return medicamentDurere;
            case RACEALA:
                MedicamentRaceala medicamentRaceala =  new MedicamentRaceala(denumire, pret);
                return medicamentRaceala;
            default:
                throw new Exception("Nu este");
        }
    }
}
