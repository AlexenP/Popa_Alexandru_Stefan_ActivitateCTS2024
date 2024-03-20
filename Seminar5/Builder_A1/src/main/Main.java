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


        builder_implicat_in_clasa.Pacient pacient3 = new builder_implicat_in_clasa.Pacient.PacientBuilder()
                .setPatRabatabil(true)
                .setPapuciDeCamera(true)
                .build();
        System.out.println("Builder implicat");
        System.out.println(pacient3);
    }
}