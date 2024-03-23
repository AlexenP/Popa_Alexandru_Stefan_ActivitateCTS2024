package main;

import classes.Banca;
import classes.Client;

// Banca dorește să implementeze un modul în cadrul aplicației, astfel încât dacă un client deține
// deja un cont la bancă și dorește deschiderea unui nou cont să nu fie necesară reconstruirea
// datelor despre respectivul client, deoarece prin construire clientul trebuie să prezinte iar
// documentele necesare precum buletin și cardul de credit pentru plată.
public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(1,"Gica","4224242324","42424234234");
        Client client2 = new Client(2,"Costi","542352342","456754675467");
        Banca banca = new Banca("Banca Transilvania");
        banca.adaugareClient(client1);
        banca.adaugareClient(client2);
        banca.adaugareClient(client1);
        System.out.println(banca.getListaClienti());
    }
}