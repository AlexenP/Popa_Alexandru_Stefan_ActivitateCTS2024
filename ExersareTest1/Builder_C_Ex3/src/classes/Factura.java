package classes;

public class Factura {
    private int numarPungi;
    private boolean plataCard;
    private boolean cardFidelitate;
    private double cotaTVA;


    public Factura(int numarPungi, boolean plataCard, boolean cardFidelitate, double cotaTVA) {
        this.numarPungi = numarPungi;
        this.plataCard = plataCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    public void setNumarPungi(int numarPungi) {
        this.numarPungi = numarPungi;
    }

    public void setCotaTVA(double cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    public void setPlataCard(boolean plataCard) {
        this.plataCard = plataCard;
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("numarPungi=").append(numarPungi);
        sb.append(", plataCard=").append(plataCard);
        sb.append(", cardFidelitate=").append(cardFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append('}');
        return sb.toString();
    }
}
