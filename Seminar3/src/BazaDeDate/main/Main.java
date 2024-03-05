package BazaDeDate.main;

import BazaDeDate.classes.ConexiuneBazaDeDate;

public class Main {
    public static void main(String[] args) {
        ConexiuneBazaDeDate conexiuneBazaDeDate1 = ConexiuneBazaDeDate
                .getInstance("Baza1",20,"link1");
        ConexiuneBazaDeDate conexiuneBazaDeDate2 = ConexiuneBazaDeDate
                .getInstance("Baza2",33,"link2");
        System.out.println(conexiuneBazaDeDate1);
        System.out.println(conexiuneBazaDeDate2);

        conexiuneBazaDeDate1.setNumeBaza("BazaModificata");
        conexiuneBazaDeDate2.setNumeBaza("BazaModificata2");
        System.out.println(conexiuneBazaDeDate1);
        System.out.println(conexiuneBazaDeDate2);


    }
}