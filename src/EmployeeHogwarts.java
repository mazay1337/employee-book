public class EmployeeHogwarts {
    private String fullName;
    private int department;
    private double salary;
    private int id;
    private static int count = 0;


    public String getFullName() { return fullName;}

    public int getDepartment() { return department; }

    public double getSalary() { return salary; }

    public int getId() { return id; }

    public void setSalary(double salary) { this.salary = salary; }

    public void setDepartment(int department) { this.department = department; }

    public EmployeeHogwarts(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        count++;
        id = count;
    }

    public String toString() {
        return "ID:" + id + " " + fullName + ", отдел №" + department + " ЗП: " + salary;
    }

    public static void printAllEmployees(EmployeeHogwarts[] employeesHogwarts) {
        for (EmployeeHogwarts employeeHogwarts : employeesHogwarts) {
            System.out.println(employeeHogwarts);
        }
    }

    public static double calculateTotalSalary(EmployeeHogwarts[] employeesHogwarts) {
        double totalSalary = 0;
        for (EmployeeHogwarts employeeHogwarts: employeesHogwarts){
            totalSalary += employeeHogwarts.getSalary();
        }
        System.out.println("Общая сумма затрат на зарплаты в месяц: " + totalSalary);
        return totalSalary;
    }

    public static EmployeeHogwarts findMinimumSalary(EmployeeHogwarts[] employeesHogwarts) {
        EmployeeHogwarts minSalary = employeesHogwarts[0];
        for (EmployeeHogwarts employeeHogwarts : employeesHogwarts) {
            if (employeeHogwarts.getSalary() < minSalary.getSalary()) {
                minSalary = employeeHogwarts;
            }
        }
        System.out.println("Всех меньше получает: " + minSalary.getFullName());
        return minSalary;
    }

    public static EmployeeHogwarts findMaximumSalary(EmployeeHogwarts[] employeesHogwarts) {
        EmployeeHogwarts maxSalary = employeesHogwarts[0];
        for (EmployeeHogwarts employeeHogwarts : employeesHogwarts) {
            if (employeeHogwarts.getSalary() > maxSalary.getSalary()) {
                maxSalary = employeeHogwarts;
            }
        }
        System.out.println("Самую большую зарплату имеет : " + maxSalary.getFullName());
        return maxSalary;
    }

    public static double calculateAverageSalary(EmployeeHogwarts[] employeesHogwarts) {
        double averageSalary = calculateTotalSalary(employeesHogwarts) / employeesHogwarts.length;
        System.out.println("Средняя зарплата составляет: " + averageSalary);
        return averageSalary;
    }

    public static  void printAllEmployeeName(EmployeeHogwarts[] employeesHogwarts) {
        for (EmployeeHogwarts employeeHogwarts : employeesHogwarts) {
            System.out.println(employeeHogwarts.getFullName());
        }
    }

    public static void indexSalary(EmployeeHogwarts[] employeesHogwarts, double percentage) {
        for (EmployeeHogwarts employeeHogwarts : employeesHogwarts) {
            double salaryIncrease = employeeHogwarts.getSalary() * (percentage / 100);
            employeeHogwarts.setSalary(employeeHogwarts.getSalary() + salaryIncrease);
        }
        printAllSalary(employeesHogwarts);
    }

    public static void printAllSalary(EmployeeHogwarts[] employeesHogwarts) {
        for (EmployeeHogwarts employeeHogwarts : employeesHogwarts) {
            System.out.println("Новая зарплата " + employeeHogwarts.getFullName() + " "  + employeeHogwarts.getSalary());
        }
    }

    public static EmployeeHogwarts findEmployeeMinSalaryDepartment(EmployeeHogwarts[] employeesHogwarts, int department) {
        EmployeeHogwarts minEmployeeSalaryDepartment = null;
        for (EmployeeHogwarts employeeHogwarts : employeesHogwarts) {
            if (employeeHogwarts.getDepartment() == department) {
                if (minEmployeeSalaryDepartment == null || employeeHogwarts.getSalary() < minEmployeeSalaryDepartment.getSalary()) {
                    minEmployeeSalaryDepartment = employeeHogwarts;
                }
            }
        }
        System.out.println("В " + department + " отделе, всех меньше получает: " + minEmployeeSalaryDepartment.getFullName());
        return minEmployeeSalaryDepartment;
    }

    public static EmployeeHogwarts findEmployeeMaxSalaryDepartment(EmployeeHogwarts[] employeesHogwarts, int department) {
        EmployeeHogwarts maxEmployeeSalaryDepartment = null;
        for (EmployeeHogwarts employeeHogwarts : employeesHogwarts) {
            if (employeeHogwarts.getDepartment() == department) {
                if (maxEmployeeSalaryDepartment == null || employeeHogwarts.getSalary() > maxEmployeeSalaryDepartment.getSalary()) {
                    maxEmployeeSalaryDepartment = employeeHogwarts;
                }
            }
        }
        System.out.println("В " + department + " отделе, больше остальных получает: " + maxEmployeeSalaryDepartment.getFullName());
        return maxEmployeeSalaryDepartment;
    }

    public static int calculateTotalSalaryDepartment(EmployeeHogwarts[] employeesHogwarts, int department) {
        int totalSalaryDepartment = 0;
        for (EmployeeHogwarts employeeHogwarts : employeesHogwarts) {
            if (employeeHogwarts.getDepartment() == department) {
                totalSalaryDepartment += employeeHogwarts.getSalary();
            }
        }
        System.out.println("В " + department + " отделе, на зарплаты потрачено: " + totalSalaryDepartment);
        return totalSalaryDepartment;
    }

    public static double calculateAverageSalaryByDepartment(EmployeeHogwarts[] employeesHogwarts, int department) {
        int employeeCount = 0;
        double salarySum = 0;
        for (EmployeeHogwarts employeeHogwarts : employeesHogwarts) {
            if (employeeHogwarts.getDepartment() == department) {
                employeeCount++;
                salarySum += employeeHogwarts.getSalary();
            }
        }
        double averageSalaryDepartment = salarySum / employeeCount;
        System.out.println("В " + department + " отделе, средняя зарплата: " + averageSalaryDepartment);
        return averageSalaryDepartment;
    }

    public static void indexSalaryDepartment(EmployeeHogwarts[] employeesHogwarts, int department, double percentage) {
        for (EmployeeHogwarts employeeHogwarts : employeesHogwarts) {
            if (employeeHogwarts.getDepartment() == department) {
                double salaryIncrease = employeeHogwarts.getSalary() * (percentage / 100);
                employeeHogwarts.setSalary(employeeHogwarts.getSalary() + salaryIncrease);
                System.out.println("В " + department + " отделе, новые зарплаты: " + employeeHogwarts.getFullName() + " "  + employeeHogwarts.getSalary());
            }
        }
    }

    public static void printEmployeesDepartment(EmployeeHogwarts[] employeesHogwarts, int department) {
        for (EmployeeHogwarts employeeHogwarts : employeesHogwarts) {
            if (employeeHogwarts.getDepartment() == department) {
                System.out.println("ID:" + employeeHogwarts.getId() + " " + employeeHogwarts.getFullName() + ", ЗП:" + employeeHogwarts.getSalary());
            }
        }
    }

    public static void printEmployeesWithSalaryLessThan(EmployeeHogwarts[] employeesHogwarts, double amount) {
        for (EmployeeHogwarts employeeHogwarts : employeesHogwarts) {
            if (employeeHogwarts.getSalary() < amount) {
                System.out.println("ID:" + employeeHogwarts.getId() + " " + employeeHogwarts.getFullName() + ", ЗП:" + employeeHogwarts.getSalary());
            }
        }
    }

    public static void printEmployeesWithSalaryGreaterThan(EmployeeHogwarts[] employeesHogwarts, double amount) {
        for (EmployeeHogwarts employeeHogwarts : employeesHogwarts) {
            if (employeeHogwarts.getSalary() >= amount) {
                System.out.println("ID:" + employeeHogwarts.getId() + " " + employeeHogwarts.getFullName() + ", ЗП:" + employeeHogwarts.getSalary());
            }
        }
    }

}

