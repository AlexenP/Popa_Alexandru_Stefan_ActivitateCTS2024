package main;

import classes.Client;
import classes.RealizareRezervare;

// Restaurantul dorește să implementeze un modul în cadrul aplicației, astfel încât dacă un client a mai fost la
// restaurant și revine pentru a fi realiza o rezervare aici să nu fie necesară reconstruirea unui cont respectivului
// client, deoarece prin construire clientului durează foarte mult.
public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(3,"Ionita");
        Client client2 = new Client(4,"Georgel");
        RealizareRezervare realizareRezervare = new RealizareRezervare("Cina festiva ora 17");
        realizareRezervare.adaugareClient(client1);
        realizareRezervare.adaugareClient(client2);
        realizareRezervare.adaugareClient(client1);
        System.out.println(realizareRezervare.getListaClienti());


    }
}