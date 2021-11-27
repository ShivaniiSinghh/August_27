class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary " + salary);
    }
}

class Employee1 extends Member {
    private String specialization;

    public Employee1(String name, int age, String phoneNumber,
                    String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member{
    private String department;

    public Manager(String name, int age, String phoneNumber,
                   String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

public class MemberSal {
    public static void main(String[] args) {
        Employee1 employee = new Employee1("Subhash", 25, "111-111-111", "Mathura", 25000.5, "IT");
        Manager manager = new Manager("Sundar", 30, "222-222-222", "Agra", 30000.5, "IT");
        employee.printSalary();
        manager.printSalary();
    }
}