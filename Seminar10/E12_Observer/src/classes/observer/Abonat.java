package classes.observer;

public class Abonat implements Observer {
    public String nume;

    public Abonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Ai primit urmatorul mesaj ca abonat: " + mesaj);
    }
}
