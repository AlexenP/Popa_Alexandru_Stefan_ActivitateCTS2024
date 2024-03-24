package classes;

public class SupaVita extends SupaAbstract{
    public SupaVita(String nume, int calorii) {
        super(nume, calorii);
    }

    @Override
    public void descriere() {
        System.out.println("Supa de vita "+ getNume() + " " + getCalorii());

    }
}
