package sustinereExamene.main;

import sustinereExamene.classes.Student;
import sustinereExamene.classes.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(123,"Pop Darius","pdp@gmail.com",2);
        Student student2 = new Student(223,"Pop Marius","pmm@gmail.com",1);
        Student student3 = new Student(313,"Rus Darius","rusD@gmail.com",3);
        Student student4 = new Student(113,"Ionescu Cosmin","ionC@gmail.com",3);

        SustinereExamen examenPoo = new SustinereExamen("Programare Orientata Obiect");
        SustinereExamen examenCts = new SustinereExamen("Calitate & Testare Software");
        //singleton Registry
        examenPoo.inregistrareStudent(student1);
        examenPoo.inregistrareStudent(student2);
        examenPoo.inregistrareStudent(student1);
        examenPoo.inregistrareStudent(student3);
        examenPoo.inregistrareStudent(student3);
        examenPoo.inregistrareStudent(student4);

    }
}
