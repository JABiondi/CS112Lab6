//Author: James Biondi
//Purpose: Create an ArrayList of objects of the student class
//Notes: This is for problem 2 and 3

import java.util.ArrayList;
import java.util.Scanner;

public class Lab6_Problem2_Problem3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<Student>();
        String firstName;
        String lastName;
        int age;
        double GPA;
        String again;
        do{
            Student student = new Student();
            System.out.println("What is the student's name?");
                firstName = input.nextLine();
                student.setFirstName(firstName);
            System.out.println("What is the student's last name?");
                lastName = input.nextLine();
                student.setLastName(lastName);
            System.out.println("What is the student's age?");
                age = input.nextInt();
                student.setAge(age);
                input.skip("\n");
            System.out.println("What is the student's GPA?");
                GPA = input.nextDouble();
                student.setGPA(GPA);
                input.skip("\n");

            students.add(student);  //appends student to array list

            System.out.println("Do you want to enter another student? (Y/N)");
            again = input.nextLine();
        }while(again.equalsIgnoreCase("y"));

        //variables for sorting
        Student temp;
        boolean sorted = false;

        while(!sorted){
            sorted = true;  //assumes we are sorted until we check. This lets us exit loop easily
            for(int i = 0; i < students.size() - 1; i++){
                if(students.get(i).compareTo(students.get(i+1)) > 0){   //comparing the two
                    temp = students.get(i);
                    students.set(i, students.get(i+1));
                    students.set(i+1, temp);
                    sorted = false; //if we are in this if statement, we aren't sorted
                }
                else if(students.get(i).compareTo(students.get(i+1)) == 0){
                     if (students.get(i).compareNames(students.get(i + 1)) == -1){
                         temp = students.get(i);
                         students.set(i, students.get(i+1));
                         students.set(i+1, temp);
                         sorted = false; //if we are in this if statement, we aren't sorted
                    }
                }
            }
        }

        //gets sorted backwards, so this list prints it the right way
        for(int i = students.size() - 1; i > -1; i--){
                System.out.print(students.get(i).getFirstName() + ", ");
                System.out.print(students.get(i).getLastName() + ", ");
                System.out.print(students.get(i).getAge() + ", ");
                System.out.print(students.get(i).getGPA() + ", ");
                if(students.get(i).checkPassing()){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }


        }
    }
}
