package main;

import decorator.AplicatieMobila;
import decorator.Decorator;
import decorator.Website;
import spital.Diagnostic;
import spital.DiagnosticAbstract;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DiagnosticAbstract diagnostic = new Diagnostic("raceala","rosu in gat", false);
        diagnostic.printeazaDiagnostic();

        Decorator decorator = new AplicatieMobila(diagnostic);
        decorator.afiseazaOnline();
        decorator.printeazaDiagnostic();

        Decorator website = new Website(diagnostic);
        website.printeazaDiagnostic();
    }
}