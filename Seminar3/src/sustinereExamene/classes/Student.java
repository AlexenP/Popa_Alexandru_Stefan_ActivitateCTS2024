package sustinereExamene.classes;

public class Student {
    private int id;
    private String name;
    private String email;
    private int an;

    public Student(int id, String name, String email, int an) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.an = an;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", an=").append(an);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
