package classes;

public class SupaCiuperci extends SupaAbstract{
    public SupaCiuperci(String nume, int calorii) {
        super(nume,calorii);
    }

    @Override
    public void descriere() {
        System.out.println("Supa de ciuperci "+ getNume() + " " + getCalorii());
    }
}
