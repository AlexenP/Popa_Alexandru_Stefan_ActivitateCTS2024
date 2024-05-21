package classes;

public class Portar {
    private Verificator verificator;

    public Portar(Verificator verificator) {
        this.verificator = verificator;
    }

    public void setVerificator(Verificator verificator) {
        this.verificator = verificator;
    }

    public void verificaSuporter(String numeSuporter){
        verificator.verificare(numeSuporter);
    }
}
