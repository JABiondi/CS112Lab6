public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double GPA;

    public Student(String firstName, String lastName, int age, double GPA){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.GPA = GPA;
    }

    public Student(){
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.GPA = 0;
    }
    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.GPA = 0;
    }

    public boolean checkPassing(){
        if(this.GPA > 2.0) return true;
        else return false;
    }

    public int compareTo(Student otherStudent){
        int res = 0;
        if (this.GPA < otherStudent.getGPA()) {
            res =- 1;
        }
        if (this.GPA > otherStudent.getGPA()) {
            res = 1;
        }
        return res;
    }
    public int compareNames(Student otherStudent){
        String smallName;
        if(this.firstName.length() >= otherStudent.firstName.length()) smallName = this.firstName;
        else smallName = otherStudent.firstName;


        for(int i = 0; i < smallName.length(); i++){    //prevent index out of bounds error
            if(this.firstName.charAt(i) < otherStudent.getFirstName().charAt(i)) {

                return -1;
            }
            else {

                return 1;
            }
        }
        return 0;
    }

    public void checkAll() {
        if (this.firstName.equals("")) {
            System.out.println("Field firstName is empty");
        }
        if (this.lastName.equals("")) {
            System.out.println("Field lastName is empty");
        }
        if(this.age == 0){
            System.out.println("Field age is empty");
        }
        if(this.GPA == 0){
            System.out.println("Field GPA is empty");
        }
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public double getGPA(){
        return GPA;
    }
    public void setFirstName(String newName){
        this.firstName = newName;
    }
    public void setLastName(String newName){
        this.lastName = newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setGPA(double newGPA){
        this.GPA = newGPA;
    }
}
