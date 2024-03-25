package main;

import classes.Client;
import classes.ClientInterface;
import classes.TipSupa;

import java.util.HashMap;
import java.util.Map;

// Restaurantul dorește să implementeze un modul în cadrul aplicației, astfel încât dacă un client a mai fost
// la restaurant și revine pentru a fi realiza o rezervare aici să nu fie necesară reconstruirea unui cont
// respectivului client, deoarece prin construire clientului durează foarte mult.
public class Main {
    public static void main(String[] args) {
        Map<String,Integer> listaSupe = new HashMap<>();
        listaSupe.put("Greceasca", 20);
        listaSupe.put("Legume", 25);
        Client prototip = new Client("Gica", TipSupa.SUPA_DE_LEGUME,40,listaSupe);
        ClientInterface client = prototip.clone();
        System.out.println(client);
    }
}