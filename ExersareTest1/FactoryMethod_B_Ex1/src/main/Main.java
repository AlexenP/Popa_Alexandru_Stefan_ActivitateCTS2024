package main;

import classes.SupaAbstract;
import classes.SupaCiuperci;
import classes.factories.FactorySupaCiuperci;
import classes.factories.FactorySupaLegume;
import classes.factories.FactorySupaVita;
import classes.factories.InterfaceFactory;

public class Main {
    public static void afisareDetalii(InterfaceFactory interfaceFactory, String nume, int calorii){
        SupaAbstract supaAbstract = interfaceFactory.createSupa(nume, calorii);
        supaAbstract.descriere();
    }
    public static void main(String[] args) {
        InterfaceFactory factorySupaCiuperci = new FactorySupaCiuperci();
        InterfaceFactory factorySupaLegume = new FactorySupaLegume();
        InterfaceFactory factorySupaVita = new FactorySupaVita();

        factorySupaVita.createSupa("Vitica",290);
        factorySupaLegume.createSupa("Legume",330);
        factorySupaLegume.createSupa("Legume2",320);
        factorySupaCiuperci.createSupa("Ciupe",140);

        afisareDetalii(new FactorySupaCiuperci(), "Ciupe",140);
        afisareDetalii(new FactorySupaVita(), "Vitica",290);



    }
}