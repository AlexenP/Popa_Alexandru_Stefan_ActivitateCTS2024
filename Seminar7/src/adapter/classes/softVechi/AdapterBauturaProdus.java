package adapter.classes.softVechi;


import adapter.classes.softNou.Bautura;

// Object Adapter
public class AdapterBauturaProdus extends Produs {
    private Bautura bautura;

    public AdapterBauturaProdus(Bautura bautura) {
        super(bautura.getDenumire(), bautura.getPret());
        this.bautura = bautura;
    }
}