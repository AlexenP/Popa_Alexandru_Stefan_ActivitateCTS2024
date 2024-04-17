package classes;

public class Caracteristici {
    private int pozitieX;
    private int pozitieY;
    private String culoare;

    public Caracteristici(int pozitieX, int pozitieY, String culoare) {
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
        this.culoare = culoare;
    }

    public int getPozitieX() {
        return pozitieX;
    }

    public void setPozitieX(int pozitieX) {
        this.pozitieX = pozitieX;
    }

    public int getPozitieY() {
        return pozitieY;
    }

    public void setPozitieY(int pozitieY) {
        this.pozitieY = pozitieY;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "Caracteristici{" +
                "pozitieX=" + pozitieX +
                ", pozitieY=" + pozitieY +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
