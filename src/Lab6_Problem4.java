public class Lab6_Problem4 {
    public static void main(String[] args){
        Student student = new Student();
        student.checkAll();
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

        Student student2 = new Student("James", "Biondi");
        student2.checkAll();
        System.out.println(student2.getFirstName());
        System.out.println(student2.getLastName());
        System.out.println(student2.getAge());
        System.out.println(student2.getGPA());
        student2.setFirstName("Sean");
        student2.setLastName("Regan");
        student2.setAge(19);
        student2.setGPA(4.0);
        System.out.println(student2.getFirstName());
        System.out.println(student2.getLastName());
        System.out.println(student2.getAge());
        System.out.println(student2.getGPA());
    }
}
