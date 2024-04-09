package spital;

public class Diagnostic implements DiagnosticAbstract {
    private String numeDiagnostic;
    private String simptome;
    private boolean necesitaSpitalizare;

    public Diagnostic(String numeDiagnostic, String simptome, boolean necesitaSpitalizare) {
        this.numeDiagnostic = numeDiagnostic;
        this.simptome = simptome;
        this.necesitaSpitalizare = necesitaSpitalizare;
    }

    @Override
    public void printeazaDiagnostic() {
        System.out.println("numele diagnostic: " + numeDiagnostic + " simptome: " + simptome + " si "
                + (necesitaSpitalizare ? "necesita spitalizare"
                : "nu necesita spitalizare"));
    }

    public String getNumeDiagnostic() {
        return numeDiagnostic;
    }

    public String getSimptome() {
        return simptome;
    }

    public boolean isNecesitaSpitalizare() {
        return necesitaSpitalizare;
    }
}
