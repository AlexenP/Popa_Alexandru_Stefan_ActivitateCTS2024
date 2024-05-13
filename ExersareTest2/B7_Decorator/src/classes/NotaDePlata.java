package classes;

public class NotaDePlata implements Nota{
    private double suma;
    public NotaDePlata(double suma) {
        this.suma = suma;
    }
    @Override
    public void oferaNotaPlata() {
        System.out.println("Nota de plata a fost inmanata. Total: "+suma);
    }
}
