package main;

import classes.MedicamentAbstract;
import classes.factories.FactoryInterface;
import classes.factories.FactoryMedicamentBody;
import classes.factories.FactoryMedicamentDurere;
import classes.factories.FactoryMedicamentRaceala;

public class Main {
    public static void afisareDetalii(FactoryInterface factoryInterface, String denumire, int pret){
        MedicamentAbstract medicamentAbstract = factoryInterface.createMedicament(denumire, pret);
        medicamentAbstract.descriere();
    }
    public static void main(String[] args) {
        FactoryInterface factoryMedicamentBody = new FactoryMedicamentBody();
        FactoryInterface factoryMedicamentRaceala = new FactoryMedicamentRaceala();
        FactoryInterface factoryMedicamentDurere = new FactoryMedicamentDurere();

        factoryMedicamentBody.createMedicament("body1",100);
        factoryMedicamentDurere.createMedicament("durere1",30);
        factoryMedicamentDurere.createMedicament("durere2",22);
        factoryMedicamentRaceala.createMedicament("raceala1",10);

        afisareDetalii(new FactoryMedicamentBody(),"body1",100);
        afisareDetalii(new FactoryMedicamentDurere(),"durere1",30);
    }
}