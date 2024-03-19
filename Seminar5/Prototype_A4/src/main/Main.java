package main;

import classes.Reteta;
import classes.RetetaAbstracta;
import classes.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

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