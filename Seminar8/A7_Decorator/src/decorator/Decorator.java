package decorator;

import spital.DiagnosticAbstract;

public abstract class Decorator implements DiagnosticAbstract{
    protected DiagnosticAbstract diagnostic;

    public abstract void afiseazaOnline();

    public Decorator(DiagnosticAbstract diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public void printeazaDiagnostic() {
        diagnostic.printeazaDiagnostic();
        System.out.println("Rezultatul este disponibil si pe platforma");
    }

    public String getNumeDiagnostic() {
        return diagnostic.getNumeDiagnostic();
    }

    public String getSimptome() {
        return diagnostic.getSimptome();
    }

    public boolean isNecesitaSpitalizare() {
        return diagnostic.isNecesitaSpitalizare();
    }
}
