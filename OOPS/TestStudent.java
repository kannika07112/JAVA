// Encapsulation: Student Details
// Create a Student class with private fields for name and roll number. 
// Add public getter and setter methods for these fields. 
// Create a student object, set values using setters, and print using getters.
class Student {
    private String name;
    private int rollNumber;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public int getRollNumber() {
        return rollNumber;
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("Emily");
        stu.setRollNumber(101);
        System.out.println(stu.getName() + " has roll number " + stu.getRollNumber());
    }
}
