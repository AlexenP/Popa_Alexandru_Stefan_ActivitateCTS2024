package classes;

public abstract class DecoratorAbstract implements Nota{
    Nota nota;

    public DecoratorAbstract(Nota nota) {
        this.nota = nota;
    }

    @Override
    public void oferaNotaPlata() {
        nota.oferaNotaPlata();
    }

    public abstract void ureazaLaMultiAni();
}
