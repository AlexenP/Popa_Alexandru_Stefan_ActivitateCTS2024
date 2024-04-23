package classes.subject;

public class Stadion extends Subject{
    @Override
    public void notificaMeciVolei() {
        super.notificareAbonati("stadion meci volei");
    }

    @Override
    public void notificaMeciHandbal() {
        super.notificareAbonati("stadion meci handbal");

    }

    @Override
    public void notificaMeciFotbal() {
        super.notificareAbonati("stadion meci fotbal");

    }
    public void notificaConcert(){
        super.notificareAbonati("a fost programat un concert");
    }
}
