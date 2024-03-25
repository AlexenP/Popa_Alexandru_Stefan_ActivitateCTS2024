package classes;

public abstract class SupaAbstract {
    public String nume;
    public int calorii;

    public SupaAbstract(String nume, int calorii) {
        this.nume = nume;
        this.calorii = calorii;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCalorii() {
        return calorii;
    }

    public void setCalorii(int calorii) {
        this.calorii = calorii;
    }

    public abstract void descriere();
}
