package adapter.classes.softVechi;

import java.util.ArrayList;
import java.util.List;

public class Bucatarie implements SoftBucatarie {
    private List<Produs> produse;

    public Bucatarie(List<Produs> produse) {
        this.produse = produse;
    }

    public Bucatarie() {
        this.produse = new ArrayList<>();
    }

    @Override
    public void adaugareProdus(Produs produs) {
        this.produse.add(produs);
    }

    @Override
    public void printareBon() {
        float sumaTotala = 0;
        System.out.println("Lista de produse este:\n");
        for(Produs produs: produse) {
            System.out.println(produs);
            sumaTotala += produs.getPret();
        }
        System.out.println("Total: " + sumaTotala + "\n");
    }
}