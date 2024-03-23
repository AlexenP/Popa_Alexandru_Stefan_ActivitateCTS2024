package classes;

import java.util.HashMap;
import java.util.Map;

public class RealizareRezervare {
    private String numeRezervare;
    Map<Integer, Client> listaClienti = new HashMap<>();

    public RealizareRezervare(String numeRezervare) {
        this.numeRezervare = numeRezervare;
    }

    public String getNumeRezervare() {
        return numeRezervare;
    }

    public void setNumeRezervare(String numeRezervare) {
        this.numeRezervare = numeRezervare;
    }

    public Map<Integer, Client> getListaClienti() {
        return listaClienti;
    }

    public void adaugareClient(Client client){
        if (listaClienti.containsKey(client.getId())){
            System.out.println("Clientul exista deja!");
        } else {
            listaClienti.put(client.getId(),client);
            System.out.println("Clientul a fost adaugat!");
        }

    }

}
