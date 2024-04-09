package classes;

public abstract class StructuraAbstracta {
    public StructuraAbstracta(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    private String nume;
    public abstract void adaugaStructura(StructuraAbstracta sa);
    public abstract void stergeStructura(StructuraAbstracta sa);
    public abstract StructuraAbstracta getStructura(int index);
    public abstract void afiseazaDescriere(String identare);
}
