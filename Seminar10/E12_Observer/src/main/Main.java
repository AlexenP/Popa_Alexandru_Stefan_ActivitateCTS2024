package main;

import classes.observer.Abonat;
import classes.observer.Observer;
import classes.observer.Vecin;
import classes.subject.Sala;
import classes.subject.Stadion;
import classes.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Observer> observatori = new ArrayList<>();
        Observer abonat1 = new Abonat("Cristi Abonat");
        Observer abonat2 = new Abonat("Ionut Abonat");
        Observer abonat3 = new Abonat("Vasi Abonat");
        Observer vecin = new Vecin("Cristi Abonat",5.2f);

        Subject sala = new Sala();
        sala.adaugaAbonat(abonat1);
        sala.adaugaAbonat(abonat2);
        sala.adaugaAbonat(abonat3);
        sala.adaugaAbonat(vecin);

        sala.notificaMeciFotbal();


        Subject stadion = new Stadion();
        stadion.adaugaAbonat(abonat1);
        stadion.adaugaAbonat(abonat2);
        stadion.adaugaAbonat(abonat3);
        stadion.adaugaAbonat(vecin);

        ((Stadion)stadion).notificaConcert();
    }
}