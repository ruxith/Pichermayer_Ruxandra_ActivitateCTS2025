package modele;

public class Student extends Persoana {
    private int idStudent;


    public Student() {
        super("STUD22", 18);
        this.idStudent = idStudent;
    }

    public Student(String nume, int varsta, int idStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    @Override
    public float calculeazaVenit() {
        return 0;
    }
}
