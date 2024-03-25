package main;

import classes.Rezervare;
import classes.RezervareBuilder;

// Atunci când un client face o rezervare poate alege una din următoarele opțiuni: așezare la geam, scaune
// ergonomice, decorarea mesei, muzica ambientala personalizata, gen muzica. În cazul în care clientul nu
// specifică vreun element dintre acestea, este setat pe false. Să se implementeze modulul care permite crearea
// de obiecte de tip rezervare cu aceste opțiuni extra.
public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new RezervareBuilder()
                .setAsezareGeam(true)
                .setDecorareaMesei(true)
                .build();
        Rezervare rezervare2 = new RezervareBuilder()
                .setAsezareGeam(true)
                .build();
        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}