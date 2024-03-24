package classes;

public class MedicamentBody extends MedicamentAbstract{
    public MedicamentBody(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public void descriere() {
        System.out.println("Medicament body cu denumire "+getDenumire()+ " si pret "+getPret());
    }
}
