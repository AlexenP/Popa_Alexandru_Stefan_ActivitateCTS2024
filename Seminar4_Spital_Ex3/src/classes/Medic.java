package classes;

public class Medic extends PersonalSpital{
    public Medic(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println(getNume()+" este medic cu salariul "+ getSalariu());
    }
}
