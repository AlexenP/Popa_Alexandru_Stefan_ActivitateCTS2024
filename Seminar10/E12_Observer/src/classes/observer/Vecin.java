package classes.observer;

public class Vecin implements Observer{
    private String nume;
    private float distanta;

    public Vecin(String nume, float distanta) {
        this.nume = nume;
        this.distanta = distanta;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Sala aflata la distanta "+distanta+" a trimis catre vecini urmatorul mesaj: "+ mesaj);
    }
}
