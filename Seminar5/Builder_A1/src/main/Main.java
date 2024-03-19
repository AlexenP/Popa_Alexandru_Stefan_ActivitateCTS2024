package main;

import classes.Pacient;
import classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientBuilder()
                .setHalatInterior(true)
                .setMicDejunInclus(true)
                .setPapuciCamera(true)
                .setPatRabatabil(true)
                .build();

        Pacient pacient2 = new PacientBuilder()
                .setPatRabatabil(true)
                .build();

        System.out.println(pacient1);
        System.out.println(pacient2);

        //TODO builder implicat
    }
}