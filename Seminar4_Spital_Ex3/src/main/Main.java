package main;

import classes.PersonalSpital;
import classes.fabricaPersonal.*;

public class Main {

    public static void prelucrarePersonal(FabricaPersonal fabricaPersonal, String nume, int salariu){
        PersonalSpital personalSpital = fabricaPersonal.createPersonal(nume, salariu);
        personalSpital.afisareDetalii();
    }
    public static void main(String[] args) {
        // FACTORY METHOD
        FabricaPersonal fabricaMedic = new FabricaMedic();
        FabricaPersonal fabricaAsistent = new FabricaAsistent();
        FabricaPersonal fabricaBrancardier = new FabricaBrancardier();
        fabricaMedic.createPersonal("Alex Cristoiu",3000);
        fabricaAsistent.createPersonal("Cristi Ion",7000);
        fabricaBrancardier.createPersonal("Albert Stan",9000);
        prelucrarePersonal(new FabricaMedic(),"Ion Ion",70000);
        prelucrarePersonal(new FabricaInfirmier(),"Ion Georgeta",8500);


    }
}