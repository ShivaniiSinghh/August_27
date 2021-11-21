import java.util.Scanner;
class EmployeeSal {
    float salary, no_of_hours;
    void getInfo(float no_of_hours, float salary) {
        this.salary = salary;
        this.no_of_hours = no_of_hours;
    }
    void addSal() {
        if (salary<500) {
            salary= salary + 10;
        }
    }
    void addWork() {
        if (no_of_hours>6) {
            salary= salary + 5;
        }
    }
    void printSalary() {
        System.out.println("Final Salary Of The Employee = " + salary + "$");
    }
    public static void main(String[] args) {
        System.out.println("Enter the salary of Employee: ");
        Scanner sc = new Scanner(System.in);
        float sal = sc.nextFloat();
        System.out.println("Enter the number of working hours:");
        float no_of_hrs = sc.nextFloat();
        EmployeeSal emp = new EmployeeSal();
        emp.getInfo(no_of_hrs, sal);
        emp.addSal();
        emp.addWork();
        emp.printSalary();
    }
}
