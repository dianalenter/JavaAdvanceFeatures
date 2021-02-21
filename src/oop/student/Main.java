package oop.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] facultate = new Student[2];
        for (int i = 0; i < facultate.length; i++) {
            System.out.print("Introduceti numele: ");
            String nume = scanner.next();
            System.out.print("Introduceti prenumele: ");
            String prenume = scanner.next();
            System.out.print("Introduceti varsta: ");
            int varsta = scanner.nextInt();
            Persoana persoana = new Persoana();
            persoana.setNume(nume);
            persoana.setPrenume(prenume);
            persoana.setVarsta(varsta);
        }

     //   Student student = new Student();
     //   System.out.println(student.getNume());
      //  System.out.println(student.getPrenume());
    }
}
