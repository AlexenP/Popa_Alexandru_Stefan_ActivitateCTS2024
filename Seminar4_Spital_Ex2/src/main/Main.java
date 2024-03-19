package main;

import classes.PersonalSpital;
import classes.fabricaPersonal.FabricaPersonal;
import classes.fabricaPersonal.TipPersonal;

public class Main {
    public static void main(String[] args) {
        // A. Spital

        FabricaPersonal fabricaPersonal = new FabricaPersonal();
        try{

            PersonalSpital medic = fabricaPersonal.createPersonal(TipPersonal.MEDIC,"Popescu Maria",15000);
            PersonalSpital asistent = fabricaPersonal.createPersonal(TipPersonal.ASISTENT,"Pop Ion",8000);
            PersonalSpital brancardier = fabricaPersonal.createPersonal(TipPersonal.BRANCARDIER,"Laurentiu Stefan",10000);
            medic.afisareDetalii();
            asistent.afisareDetalii();
            brancardier.afisareDetalii();
        } catch (Exception e){
            throw new RuntimeException();
        }

    }
}