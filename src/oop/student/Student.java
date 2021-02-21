package oop.student;

public class Student extends Persoana {
    private String numeFacultate;
    private int nrMatricol;

    public Student(Persoana persoana, String numeFacultate, int nrMatricol) {

        this.numeFacultate = numeFacultate;
        this.nrMatricol = nrMatricol;
    }
}
