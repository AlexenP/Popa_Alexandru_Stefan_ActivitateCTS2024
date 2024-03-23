package classes;

public class Client {
    private int id;
    private String nume;
    private String cnp;
    private String iban;

    public Client(int id, String nume, String cnp, String iban) {
        this.id = id;
        this.nume = nume;
        this.cnp = cnp;
        this.iban = iban;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Client{");
        sb.append("id=").append(id);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", cnp='").append(cnp).append('\'');
        sb.append(", iban='").append(iban).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
