package classes.subject;

import classes.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> listaObserveri = new ArrayList<>();

    public Subject() {
    }

    public void adaugaAbonat(Observer observer){
        listaObserveri.add(observer);
    }

    public void stergereAbonat(Observer observer){
        listaObserveri.remove(observer);
    }

    public void notificareAbonati(String mesaj){
        for (Observer observer: listaObserveri){
            observer.primesteNotificare(mesaj);
        }
    }

    public abstract void notificaMeciVolei();
    public abstract void notificaMeciHandbal();
    public abstract void notificaMeciFotbal();
}
