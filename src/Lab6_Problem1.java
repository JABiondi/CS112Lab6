//Author: James Biondi
//Purpose: Create a Student from the Student Class and assign it data.

public class Lab6_Problem1 {
    public static void main(String[] args){
        Student student = new Student();

        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getAge());
        System.out.println(student.getGPA());
        student.setFirstName("Joe");
        student.setLastName("Creamer");
        student.setAge(19);
        student.setGPA(4.0);
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getAge());
        System.out.println(student.getGPA());

    }

}
