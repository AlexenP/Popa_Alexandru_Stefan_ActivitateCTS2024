package classes;

public abstract class MedicamentAbstract {
    private String denumire;
    private int pret;

    public MedicamentAbstract(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public abstract void descriere();
}
