package classes.subject;

public class Sala extends Subject{
    public Sala() {
        super();
    }

    @Override
    public void notificaMeciVolei() {
        String mesaj = "Va avea loc un meci de volei pe data de 23.04";
        notificareAbonati(mesaj);
    }

    @Override
    public void notificaMeciHandbal() {
        String mesaj = "Va avea loc un meci de handbal pe data de 25.04";
        notificareAbonati(mesaj);
    }

    @Override
    public void notificaMeciFotbal() {
        String mesaj = "Va avea loc un meci de fotbal pe data de 24.04";
        notificareAbonati(mesaj);
    }
}
