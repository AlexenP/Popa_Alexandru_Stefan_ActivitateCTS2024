package main;

import classes.Reteta;
import classes.RetetaAbstracta;
import classes.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

// Spitalul are în dotare și un laborator în care mai mulți chimiști produc diferite rețete pentru medicamente.
// În momentul în care o rețetă este produsă trebuie ținut cont de cantitățile din soluțiile care sunt folosite.
// Dacă o rețetă este creată este recomandat să fie folosită pentru crearea viitoarelor medicamente fără a se
// trece prin procesul de creare al rețetei. Să se implementeze modulul care facilitează crearea de noi obiecte
// de rețete fără a fi nevoie de apelul constructorului.
public class Main {
    public static void main(String[] args) {
        Map<String,Double> solutii = new HashMap<>();
        solutii.put("solutie1",21.0);
        solutii.put("solutie2",24.3);
        Reteta prototip = new Reteta(solutii,"reteta1");

        RetetaAbstracta reteta1 =prototip.clone();
        System.out.println(reteta1);

        RetetaCrema retetaCremaPrototip = new RetetaCrema("Galbenele",45);
        RetetaAbstracta retetaCrema = retetaCremaPrototip.clone();
        System.out.println(retetaCrema);
    }
}