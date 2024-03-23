package classes;

import java.util.HashMap;
import java.util.Map;

public class Banca {
    private String nume;
    Map<Integer, Client> listaClienti = new HashMap<>();

    public Banca(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Map<Integer, Client> getListaClienti() {
        return listaClienti;
    }

    public void adaugareClient(Client client){
        if (listaClienti.containsKey(client.getId())){
            System.out.println("Clientul este deja autentificat!");
        } else {
            listaClienti.put(client.getId(),client);
            System.out.println("Clientul a fost adaugat!");
        }
    }
}
