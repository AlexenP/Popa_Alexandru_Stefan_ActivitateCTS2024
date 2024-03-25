package classes;

public class ContBancar implements ContBancarInterface{
    private String buletin;
    private String cardCredit;
    private Double valoareCredit;

    public ContBancar() {
        this.buletin="Necunoscut";
        this.cardCredit="00000000";
        this.valoareCredit=1000D;
    }

    public ContBancar(String buletin, String cardCredit, Double valoareCredit) {
        this.buletin = buletin;
        this.cardCredit = cardCredit;
        this.valoareCredit = valoareCredit;
    }

    public String getBuletin() {
        return buletin;
    }

    public void setBuletin(String buletin) {
        this.buletin = buletin;
    }

    public String getCardCredit() {
        return cardCredit;
    }

    public void setCardCredit(String cardCredit) {
        this.cardCredit = cardCredit;
    }

    public Double getValoareCredit() {
        return valoareCredit;
    }

    public void setValoareCredit(Double valoareCredit) {
        this.valoareCredit = valoareCredit;
    }

    @Override
    public ContBancarInterface clone() {
        ContBancar abstracta = new ContBancar();
        abstracta.setBuletin(this.buletin);
        abstracta.setCardCredit(this.cardCredit);
        abstracta.setValoareCredit(this.valoareCredit);
        return abstracta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContBancar{");
        sb.append("buletin='").append(buletin).append('\'');
        sb.append(", cardCredit='").append(cardCredit).append('\'');
        sb.append(", valoareCredit=").append(valoareCredit);
        sb.append('}');
        return sb.toString();
    }
}
