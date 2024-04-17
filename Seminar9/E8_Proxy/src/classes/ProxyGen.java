package classes;

public class ProxyGen implements Vanzare{
    private Vanzare vanzareBilet;
    private String genAcceptat;

    public ProxyGen(Vanzare vanzareBilet, String genAcceptat) {
        this.vanzareBilet = vanzareBilet;
        this.genAcceptat = genAcceptat;
    }

    @Override
    public void vanzare(Persoana persoana) {
        if (genAcceptat.equals(persoana.getGen())){
            vanzareBilet.vanzare(persoana);
        } else {
            System.out.println("Acest eveniment este acceptat doar persoanelor de gen "+genAcceptat);
        }
    }
}
