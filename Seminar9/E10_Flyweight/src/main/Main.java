package main;

import classes.Caracteristici;
import classes.Fabrica;

public class Main {

    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        Caracteristici caracteristici1 = new Caracteristici(10,13,"verde");
        Caracteristici caracteristici2 = new Caracteristici(12,13,"rosu");
        Caracteristici caracteristici3 = new Caracteristici(9,4,"rosu");
        Caracteristici caracteristici4 = new Caracteristici(12,13,"alb");

        fabrica.getSpectator(10,10).deseneaza(caracteristici1);
        fabrica.getSpectator(20,10).deseneaza(caracteristici2);
        fabrica.getSpectator(10,10).deseneaza(caracteristici3);
        fabrica.getSpectator(20,20).deseneaza(caracteristici4);
    }
}