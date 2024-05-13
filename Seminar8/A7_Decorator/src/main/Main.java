package main;

import decorator.AplicatieMobila;
import decorator.Decorator;
import decorator.Website;
import spital.Diagnostic;
import spital.DiagnosticAbstract;

/*
Spitalul dorește să testeze punerea la dispoziție a rezultatelor prin intermediul platformei online
ci nu doar printat. Există însă riscul să se revină la forma inițială de punere la dispoziția pacienților
a rezultatelor. Se dorește adăugarea acestei noi funcționalități pentru sistemul software, care să permită
revenirea la situația inițială.
 */

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