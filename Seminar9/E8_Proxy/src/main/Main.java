package main;

import classes.*;

public class Main {
    public static void main(String[] args) {
        Vanzare vanzare = new VanzareBilet("S vs D",500);
        Vanzare proxyVarsta = new ProxyVarsta(vanzare);
        Persoana persoana = new Persoana("Cristian",33,"M");
        Persoana persoana2 = new Persoana("Dorel",12,"F");

        vanzare.vanzare(persoana);
        vanzare.vanzare(persoana2);

        proxyVarsta.vanzare(persoana);
        proxyVarsta.vanzare(persoana2);

        Vanzare proxyGen = new ProxyGen(vanzare,"M");
        proxyGen.vanzare(persoana);
        proxyGen.vanzare(persoana2);
    }
}