package classes;

public class ProxyVarsta implements Vanzare{
    private Vanzare vanzareBilet;
    private static int varstaMinima=18;

    public ProxyVarsta(Vanzare vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    public static void setVarstaMinima(int varstaMinima) {
        ProxyVarsta.varstaMinima = varstaMinima;
    }

    @Override
    public void vanzare(Persoana persoana) {
        if (persoana.getVarsta()>=varstaMinima){
            vanzareBilet.vanzare(persoana);
        }else {
            System.out.println("Persoana are varsta de "+persoana.getVarsta()+ " si nu poate participa!");
        }
    }
}
