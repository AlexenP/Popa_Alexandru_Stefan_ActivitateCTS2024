package main;

import classes.Factura;
import classes.FacturaBuilder;

// Atunci când un client achiziționează o rețetă în aplicație se realizează un obiect de tipul factură.
// Un obiect de tipul factură conține și informații extra precum: numarPungi, daca acel client a cerut
// pungi pentru medicamentele achiziționate, plataCuCard, dacă este selectată o plată cu cardul ci nu cash,
// cardFidelitate, dacă este prezentat cardul de fidelitate al clientului, cotaTVA, dacă respectivul client este
// plătitor de TVA, în caz contrar o să fie trecut 0. Să se implementeze modulul care permite crearea de obiecte
// de tip factură cu aceste opțiuni extra.
public class Main {
    public static void main(String[] args) {
        Factura factura1 = new FacturaBuilder()
                .setCardFidelitate(true)
                .setCotaTVA(22)
                .setNumarPungi(2)
                .setPlataCard(true)
                .build();
        Factura factura2 = new FacturaBuilder()
                .setPlataCard(true)
                .build();

        System.out.println(factura1);
        System.out.println(factura2);
    }
}