package main;

// 1. Farmacia dorește ca toate medicamentele să facă parte dintr-o categorie. Categoriile sunt salvate într-un enum
// {Raceala, Durere, Body}. Fiecare medicament o sa aibă preț și denumire. Să se implementeze modul care va
// inițializa obiecte din familia medicamentelor.

import classes.MedicamentAbstract;
import classes.MedicamentRaceala;
import classes.factory.FactoryMedicament;
import classes.factory.TipMedicament;

public class Main {
    public static void main(String[] args) {
        FactoryMedicament factoryMedicament = new FactoryMedicament();
        try {
            MedicamentAbstract medicamentRaceala = factoryMedicament.createMedicament(TipMedicament.RACEALA,"parasinus",15);
            MedicamentAbstract medicamentBody = factoryMedicament.createMedicament(TipMedicament.BODY,"crema",30);
            MedicamentAbstract medicamentBody2 = factoryMedicament.createMedicament(TipMedicament.BODY,"crema2",50);
            MedicamentAbstract medicamentDurere = factoryMedicament.createMedicament(TipMedicament.DURERE,"pastila",20);

            medicamentRaceala.descriere();
            medicamentBody.descriere();
            medicamentBody2.descriere();
            medicamentDurere.descriere();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}