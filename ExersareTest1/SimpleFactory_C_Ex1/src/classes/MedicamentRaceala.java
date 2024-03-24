package classes;

public class MedicamentRaceala extends MedicamentAbstract{
    public MedicamentRaceala(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public void descriere() {
        System.out.println("Medicament raceala cu denumire "+getDenumire()+ " si pret "+getPret());

    }
}
