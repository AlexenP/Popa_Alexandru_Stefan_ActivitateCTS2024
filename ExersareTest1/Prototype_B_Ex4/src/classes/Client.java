package classes;

import java.util.HashMap;
import java.util.Map;

public class Client implements ClientInterface{
    private String nume;
    private TipSupa supaPreferata;
    private int bacsisStandard;
    // numele supei + pret
    private Map<String,Integer> supe;

    public void setSupe(Map<String, Integer> supeMap) {
        if (this.supe == null){
            this.supe = new HashMap<>();
        }
        for(String supa:supeMap.keySet()){
            this.supe.put(supa,supeMap.get(supa));
        }

    }

    public Client() {
        this.nume="Necunoscut";
        this.bacsisStandard=0;
        this.supaPreferata=TipSupa.SUPA_DE_CIUPERCI;
        this.supe = null;
    }

    @Override
    public ClientInterface clone() {
        Client abstracta = new Client();
        abstracta.setNume(this.nume);
        abstracta.setSupaPreferata(this.supaPreferata);
        abstracta.setBacsisStandard(this.bacsisStandard);
        abstracta.setSupe(this.supe);
        return abstracta;
    }

    public Client(String nume, TipSupa supaPreferata, int bacsisStandard, Map<String, Integer> supe) {
        this.nume = nume;
        this.supaPreferata = supaPreferata;
        this.bacsisStandard = bacsisStandard;
        this.supe = supe;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public TipSupa getSupaPreferata() {
        return supaPreferata;
    }

    public void setSupaPreferata(TipSupa supaPreferata) {
        this.supaPreferata = supaPreferata;
    }

    public int getBacsisStandard() {
        return bacsisStandard;
    }

    public void setBacsisStandard(int bacsisStandard) {
        this.bacsisStandard = bacsisStandard;
    }

    public Map<String, Integer> getSupe() {
        return supe;
    }



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", supaPreferata=").append(supaPreferata);
        sb.append(", bacsisStandard=").append(bacsisStandard);
        sb.append(", supe=").append(supe);
        sb.append('}');
        return sb.toString();
    }
}
