package classes;

public class RezervareBuilder implements Builder{
    Rezervare rezervare;

    public RezervareBuilder() {
        rezervare = new Rezervare(false,false,false,false);
    }

    public RezervareBuilder setAsezareGeam(boolean asezareGeam) {
        this.rezervare.setAsezareGeam(asezareGeam);
        return this;
    }

    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.rezervare.setScauneErgonomice(scauneErgonomice);
        return this;
    }

    public RezervareBuilder setDecorareaMesei(boolean decorareaMesei) {
        this.rezervare.setDecorareaMesei(decorareaMesei);
        return this;
    }

    public RezervareBuilder setMuzincaAmbientala(boolean muzincaAmbientala) {
        this.rezervare.setMuzincaAmbientala(muzincaAmbientala);
        return this;
    }
    @Override
    public Rezervare build() {
        return rezervare;
    }
}
