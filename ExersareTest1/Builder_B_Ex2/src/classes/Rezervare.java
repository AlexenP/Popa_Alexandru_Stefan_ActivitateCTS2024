package classes;
//așezare la geam, scaune
//// ergonomice, decorarea mesei, muzica ambientala personalizata, gen muzica
public class Rezervare {
    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorareaMesei;
    private boolean muzincaAmbientala;

    public Rezervare(boolean asezareGeam, boolean scauneErgonomice, boolean decorareaMesei, boolean muzincaAmbientala) {
        this.asezareGeam = asezareGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareaMesei = decorareaMesei;
        this.muzincaAmbientala = muzincaAmbientala;
    }

    public void setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei = decorareaMesei;
    }

    public void setMuzincaAmbientala(boolean muzincaAmbientala) {
        this.muzincaAmbientala = muzincaAmbientala;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("asezareGeam=").append(asezareGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareaMesei=").append(decorareaMesei);
        sb.append(", muzincaAmbientala=").append(muzincaAmbientala);
        sb.append('}');
        return sb.toString();
    }
}
