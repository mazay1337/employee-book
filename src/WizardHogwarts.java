public class WizardHogwarts {

    private final String fullName;
    private int department;
    private double salary;
    private int id;
    private static int count = 0;


    public WizardHogwarts(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++count;
    }

    public String getFullName() { return fullName;}

    public int getDepartment() { return department; }

    public double getSalary() { return salary; }

    public int getId() { return id; }

    public void setSalary(double salary) { this.salary = salary; }

    public void setDepartment(int department) { this.department = department; }

    public String toString() {
        return "ID:" + id + " " + fullName + ", отдел №" + department + " ЗП: " + salary;
    }



}

