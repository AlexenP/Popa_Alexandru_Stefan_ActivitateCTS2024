package classes;

public class VerificatorPeluza implements Verificator{
    @Override
    public void verificare(String numeSuporter) {
        System.out.println("este verificat biletul peluza al lui "+numeSuporter);
    }
}
