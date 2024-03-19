package classes;


import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaAbstracta{
    private Map<String,Double> solutii;
    private String numeReteta;

    public Reteta(){
        numeReteta="nou";
        solutii = null;
    }

    public Reteta(Map<String, Double> solutii, String numeReteta) {
        this.solutii = solutii;
        this.numeReteta = numeReteta;
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    public void setSolutii(Map<String, Double> solutii) {
        if (this.solutii ==null){
            this.solutii = new HashMap<>();
        }
        for (String solutie: solutii.keySet()){
            this.solutii.put(solutie, solutii.get(solutie));
        }
    }

    public String getNumeReteta() {
        return numeReteta;
    }

    public void setNumeReteta(String numeReteta) {
        this.numeReteta = numeReteta;
    }

    @Override
    public RetetaAbstracta clone() {
        Reteta abstracta = new Reteta();
        abstracta.setSolutii(this.solutii);
        abstracta.setNumeReteta(this.numeReteta);
        return abstracta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reteta{");
        sb.append("solutii=").append(solutii);
        sb.append(", numeReteta='").append(numeReteta).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
