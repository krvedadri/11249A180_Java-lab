class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    void code() {
        System.out.println("Developer is coding");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Manager is managing the team");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Developer d = new Developer();
        d.work();
        d.code();

        Manager m = new Manager();
        m.work();
        m.manage();
    }
}