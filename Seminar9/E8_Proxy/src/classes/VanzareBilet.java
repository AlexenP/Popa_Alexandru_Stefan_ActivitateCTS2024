package classes;

public class VanzareBilet implements Vanzare{
    private String meci;
    private int pret;

    public VanzareBilet(String meci, int pret) {
        this.meci = meci;
        this.pret = pret;
    }

    @Override
    public void vanzare(Persoana persoana) {
        System.out.println(persoana.getNume()+" a cumparat bilet la meciul "+meci+" platind "+pret);
    }
}
