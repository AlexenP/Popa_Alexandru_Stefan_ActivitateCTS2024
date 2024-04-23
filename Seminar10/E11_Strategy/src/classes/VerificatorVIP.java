package classes;

public class VerificatorVIP implements Verificator{
    @Override
    public void verificare(String numeSuporter) {
        System.out.println("este verificat biletul VIP al lui "+numeSuporter);
    }
}
