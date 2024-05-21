package main;

import classes.Portar;
import classes.VerificatorPeluza;
import classes.VerificatorTribuna;
import classes.VerificatorVIP;

public class Main {
    public static void main(String[] args) {
        String suporter1 = "Gigel VIP";
        String suporter2 = "Gigel Peluza";
        String suporter3 = "Gigel Tribuna";

        Portar portar = new Portar(new VerificatorVIP());
        portar.verificaSuporter(suporter1);

        portar.setVerificator(new VerificatorPeluza());
        portar.verificaSuporter(suporter2);

        portar.setVerificator(new VerificatorTribuna());
        portar.verificaSuporter(suporter3);
    }
}