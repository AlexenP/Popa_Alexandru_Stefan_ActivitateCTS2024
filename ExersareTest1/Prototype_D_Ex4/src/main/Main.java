package main;

import classes.ContBancar;
import classes.ContBancarInterface;

// Banca dorește să implementeze un modul în cadrul aplicației, astfel încât dacă un client deține deja un
// cont la bancă și dorește deschiderea unui nou cont să nu fie necesară reconstruirea datelor despre respectivul
// client, deoarece prin construire clientul trebuie să prezinte iar documentele necesare precum buletin și cardul
// de credit pentru plată.
public class Main {
    public static void main(String[] args) {
        ContBancar prototip = new ContBancar("Alex Ion","543534503",20000D);
        ContBancarInterface contBancar = prototip.clone();
        System.out.println(contBancar);
    }
}