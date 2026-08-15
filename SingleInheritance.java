class Person {
    void speak() {
        System.out.println("Person is speaking");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student is studying");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {

        Student s = new Student();

        s.speak();
        s.study();
    }
}