package decorator;

import spital.DiagnosticAbstract;

public class Website extends Decorator{
    public Website(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afiseazaOnline() {
        System.out.println("in cadrul website ului ati primit "+
                super.getNumeDiagnostic()+ " "+super.getSimptome());
    }
}
