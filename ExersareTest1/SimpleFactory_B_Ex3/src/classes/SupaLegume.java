package classes;

public class SupaLegume extends SupaAbstract{

    public SupaLegume(String nume, int calorii) {
        super(nume, calorii);
    }

    @Override
    public void descriere() {
        System.out.println("Supa de legume "+ getNume() + " " + getCalorii());

    }
}
