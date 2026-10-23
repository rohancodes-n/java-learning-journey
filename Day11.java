
class Student {
    String name;
    int age;
    int marks;

    void display() {
        System.out.println(name + " | " + age + " | " + marks);
        System.out.println(isPass() ? "Pass" : "Fail");
    }

    boolean isPass() {
        return marks > 40;
    }
}

public class Day11 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Rohan";
        s1.age = 15;
        s1.marks = 90;

        s1.display();
    }
}
