package org.burakkahraman.oop;

public class MainOop {
    public static void main(String[] args) {
        Student student= new Student();
        student.setStudentId(1L);
        student.setStudentName("Burak");
        student.setStudentSurname("Kahraman");
        System.out.println(student);
        String data= student.fullName();
        System.out.println(data);
    }
}
