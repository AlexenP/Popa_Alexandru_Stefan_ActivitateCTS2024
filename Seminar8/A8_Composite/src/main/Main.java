package main;

import classes.Departament;
import classes.Sectie;
import classes.StructuraAbstracta;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StructuraAbstracta cardiologie = new Departament("cardiologie","rusu");
        StructuraAbstracta oftalmologie = new Departament("oftalmologie","gheorghe");

        StructuraAbstracta terapieIntensiva = new Sectie("ATI",10,"Costi");
        StructuraAbstracta donare = new Sectie("donare de sange",5,"Doru");
        StructuraAbstracta optometrie = new Sectie("Optometrie",2,"Ionut");

        cardiologie.adaugaStructura(terapieIntensiva);
        cardiologie.adaugaStructura(donare);

        oftalmologie.adaugaStructura(optometrie);

        StructuraAbstracta spital = new Departament("spital","Alex");
        spital.adaugaStructura(oftalmologie);
        spital.adaugaStructura(cardiologie);

        spital.afiseazaDescriere(" ");
    }
}