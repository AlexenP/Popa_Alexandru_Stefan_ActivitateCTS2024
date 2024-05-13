package main;

import classes.DecoratorAbstract;
import classes.Nota;
import classes.NotaDePlata;
import classes.NotaDecorata;

/*
Cu ocazia sărbătorilor de sfârșit de an managerul restaurantului dorește ca atunci când este printat o notă
 să se printeze și o felicitare de la Mulți ani pentru client. Se dorește adăugarea acestei noi funcționalități
  pentru clasa NotaDePlata la printare.

 */
public class Main {
    public static void main(String[] args) {
        Nota notaSimpla = new NotaDePlata(300);

        NotaDecorata notaFelicitare = new NotaDecorata(notaSimpla);
        // parinte                        copil

        notaSimpla.oferaNotaPlata();
        notaFelicitare.oferaNotaPlata();
        notaFelicitare.ureazaLaMultiAni();
    }
}