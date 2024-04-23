package classes;

public class VerificatorTribuna implements Verificator {
    @Override
    public void verificare(String numeSuporter) {
        System.out.println("este verificat biletul tribuna al lui " + numeSuporter);
    }
}
