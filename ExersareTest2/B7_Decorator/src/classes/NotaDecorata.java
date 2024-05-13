package classes;

public class NotaDecorata extends DecoratorAbstract{
    public NotaDecorata(Nota nota) {
        super(nota);
    }

    @Override
    public void ureazaLaMultiAni() {
        System.out.println("La multi ani!");
    }
}
