public class Main {
    public static void main(String[] args) {

        EmployeeHogwarts[] employeesHogwarts = new EmployeeHogwarts[10];

        employeesHogwarts[0] = new EmployeeHogwarts("Albus Dumbledore", 1, 1_000_000);
        employeesHogwarts[1] = new EmployeeHogwarts("Severus Snape", 2, 250_000);
        employeesHogwarts[2] = new EmployeeHogwarts("Minerva McGonsgall", 1, 350_000);
        employeesHogwarts[3] = new EmployeeHogwarts("Alastor Moody", 2, 200_000);
        employeesHogwarts[4] = new EmployeeHogwarts("Horace Slughorn", 3, 210_000);
        employeesHogwarts[5] = new EmployeeHogwarts("Dolores Umbridge", 5, 400_000);
        employeesHogwarts[6] = new EmployeeHogwarts("Gilderoy Lockhart", 4, 150_000);
        employeesHogwarts[7] = new EmployeeHogwarts("Quirinus Quirrell",5, 100_000);
        employeesHogwarts[8] = new EmployeeHogwarts("Remus Lupin", 2, 170_000);
        employeesHogwarts[9] = new EmployeeHogwarts("Rolanda Hooch",4, 330_000);

        EmployeeHogwarts.printAllEmployees(employeesHogwarts);

        EmployeeHogwarts.calculateTotalSalary(employeesHogwarts);

        EmployeeHogwarts.findMinimumSalary(employeesHogwarts);

        EmployeeHogwarts.findMaximumSalary(employeesHogwarts);

        EmployeeHogwarts.calculateAverageSalary(employeesHogwarts);

        EmployeeHogwarts.printAllEmployeeName(employeesHogwarts);



        EmployeeHogwarts.indexSalary(employeesHogwarts, 15);

        EmployeeHogwarts.findEmployeeMinSalaryDepartment(employeesHogwarts, 2);

        EmployeeHogwarts.findEmployeeMaxSalaryDepartment(employeesHogwarts, 4);

        EmployeeHogwarts.calculateTotalSalaryDepartment(employeesHogwarts, 1);

        EmployeeHogwarts.calculateAverageSalaryByDepartment(employeesHogwarts, 3);

        EmployeeHogwarts.indexSalaryDepartment(employeesHogwarts, 5, 10);

        EmployeeHogwarts.printEmployeesDepartment(employeesHogwarts, 1);

        EmployeeHogwarts.printEmployeesWithSalaryLessThan(employeesHogwarts, 130_000);

        EmployeeHogwarts.printEmployeesWithSalaryGreaterThan(employeesHogwarts, 500_000);
    }
}
