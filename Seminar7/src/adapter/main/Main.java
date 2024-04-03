package adapter.main;

import adapter.classes.softNou.Bautura;
import adapter.classes.softVechi.*;

public class Main {
    public static void platesteConsumatia(SoftBucatarie comanda) {
        comanda.printareBon();
    }

    public static void main(String[] args) {
        SoftBucatarie bucatarie = new Bucatarie();
        bucatarie.adaugareProdus(new Produs("ciorba", 20));
        bucatarie.adaugareProdus(new Produs("pizza", 45));
        platesteConsumatia(bucatarie);

//        Bar bar = new Bar();
//        bar.adaugaBautura(new Bautura("Ursus", 20, 14));
//        bar.adaugaBautura(new Bautura("JB", 50, 30));
//        platesteConsumatia(bar);

        // adaptam barul la bucatarie
        // ClasaExistenta: bar
        // ClasaContextNou: bucatarie

        // AdapterComandaBarBucatarie: este si bar si bucatarie practic
        AdapterComandaBarBucatarie bar = new AdapterComandaBarBucatarie();
        bar.adaugaBautura(new Bautura("Cola", 20, 0));
        bar.adaugaBautura(new Bautura("Pepsi", 15, 0));
        bar.adaugaBautura(new Bautura("Sprite", 18, 0));

        // bar.adaugareProdus(new Bautura("Apa", 5, 0)); aici ne trb adapter de obiecte Bautura -> Produs
        bar.adaugareProdus(new AdapterBauturaProdus(new Bautura("Apa", 5, 0)));

        platesteConsumatia(bar);

    }
}