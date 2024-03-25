package classes;

public class MedicamentDurere extends MedicamentAbstract{
    public MedicamentDurere(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public void descriere() {
        System.out.println("Medicament durere cu denumire "+getDenumire()+ " si pret "+getPret());

    }
}
