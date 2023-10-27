public class WizardHogwarts {
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

    public WizardHogwarts(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        count++;
        id = count;
    }

    public String toString() {
        return "ID:" + id + " " + fullName + ", отдел №" + department + " ЗП: " + salary;
    }

    public static void printSeparator() {
        System.out.println();
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *");
    }

    public static void printAllWizards(WizardHogwarts[] wizardsHogwarts) {
        printSeparator();
        System.out.println("<List of all Hogwarts wizards>");
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            System.out.println(wizardHogwarts);
        }
    }

    public static double calculateTotalSalary(WizardHogwarts[] wizardsHogwarts) {
        printSeparator();
        double totalSalary = 0;
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts){
            totalSalary += wizardHogwarts.getSalary();
        }
        System.out.println("Total salary per month: " + totalSalary);
        return totalSalary;
    }

    public static WizardHogwarts findMinimumSalary(WizardHogwarts[] wizardsHogwarts) {
        printSeparator();
        WizardHogwarts minSalary = wizardsHogwarts[0];
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getSalary() < minSalary.getSalary()) {
                minSalary = wizardHogwarts;
            }
        }
        System.out.println("Lowest salary: " + minSalary.getFullName());
        return minSalary;
    }

    public static WizardHogwarts findMaximumSalary(WizardHogwarts[] wizardsHogwarts) {
        printSeparator();
        WizardHogwarts maxSalary = wizardsHogwarts[0];
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getSalary() > maxSalary.getSalary()) {
                maxSalary = wizardHogwarts;
            }
        }
        System.out.println("Highest salary: " + maxSalary.getFullName());
        return maxSalary;
    }

    public static double calculateAverageSalary(WizardHogwarts[] wizardsHogwarts) {
        printSeparator();
        double totalSalary = 0;
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts){
            totalSalary += wizardHogwarts.getSalary();
        }
        double averageSalary = totalSalary / wizardsHogwarts.length;
        System.out.println("Average salary: " + averageSalary);
        return averageSalary;
    }

    public static  void printAllWizardName(WizardHogwarts[] wizardsHogwarts) {
        printSeparator();
        System.out.println("<Names of all wizards>");
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            System.out.println(wizardHogwarts.getFullName());
        }
    }

    public static void indexSalary(WizardHogwarts[] wizardsHogwarts, double percentage) {
        printSeparator();
        System.out.println("<Salary increase by " + percentage + " percent>");
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            double salaryIncrease = wizardHogwarts.getSalary() * (percentage / 100);
            wizardHogwarts.setSalary(wizardHogwarts.getSalary() + salaryIncrease);
            System.out.println(wizardHogwarts.getFullName() + " "  + wizardHogwarts.getSalary());
        }

    }

    public static WizardHogwarts findEmployeeMinSalaryDepartment(WizardHogwarts[] wizardsHogwarts, int department) {
        printSeparator();
        WizardHogwarts minWizardSalaryDepartment = null;
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getDepartment() == department) {
                if (minWizardSalaryDepartment == null || wizardHogwarts.getSalary() < minWizardSalaryDepartment.getSalary()) {
                    minWizardSalaryDepartment = wizardHogwarts;
                }
            }
        }
        System.out.println("Department number " + department + " has the lowest salsry: " + minWizardSalaryDepartment.getFullName());
        return minWizardSalaryDepartment;
    }

    public static WizardHogwarts findEmployeeMaxSalaryDepartment(WizardHogwarts[] wizardsHogwarts, int department) {
        printSeparator();
        WizardHogwarts maxWizardSalaryDepartment = null;
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getDepartment() == department) {
                if (maxWizardSalaryDepartment == null || wizardHogwarts.getSalary() > maxWizardSalaryDepartment.getSalary()) {
                    maxWizardSalaryDepartment = wizardHogwarts;
                }
            }
        }
        System.out.println("Department number " + department + " has the highest salary: " + maxWizardSalaryDepartment.getFullName());
        return maxWizardSalaryDepartment;
    }

    public static int calculateTotalSalaryDepartment(WizardHogwarts[] wizardsHogwarts, int department) {
        printSeparator();
        int totalSalaryDepartment = 0;
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getDepartment() == department) {
                totalSalaryDepartment += wizardHogwarts.getSalary();
            }
        }
        System.out.println("In department " + department + " spent on salaries: " + totalSalaryDepartment);
        return totalSalaryDepartment;
    }

    public static double calculateAverageSalaryByDepartment(WizardHogwarts[] wizardsHogwarts, int department) {
        printSeparator();
        int wizardCount = 0;
        double salarySum = 0;
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getDepartment() == department) {
                wizardCount++;
                salarySum += wizardHogwarts.getSalary();
            }
        }
        double averageSalaryDepartment = salarySum / wizardCount;
        System.out.println("Average salary in department " + department + ": " + averageSalaryDepartment);
        return averageSalaryDepartment;
    }

    public static void indexSalaryDepartment(WizardHogwarts[] wizardsHogwarts, int department, double percentage) {
        printSeparator();
        System.out.println("<New salaries in department " + department + ">");
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getDepartment() == department) {
                double salaryIncrease = wizardHogwarts.getSalary() * (percentage / 100);
                wizardHogwarts.setSalary(wizardHogwarts.getSalary() + salaryIncrease);
                System.out.println(wizardHogwarts.getFullName() + " "  + wizardHogwarts.getSalary());
            }
        }
    }

    public static void printWizardsDepartment(WizardHogwarts[] wizardsHogwarts, int department) {
        printSeparator();
        System.out.println("<Data of the wizards from the " + department + "rd department>");
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getDepartment() == department) {
                System.out.println("ID:" + wizardHogwarts.getId() + " " + wizardHogwarts.getFullName() + ", ЗП:" + wizardHogwarts.getSalary());
            }
        }
    }

    public static void printWizardsWithSalaryLessThan(WizardHogwarts[] wizardsHogwarts, double amount) {
        printSeparator();
        System.out.println("<Wizards whose salsry is less than " + amount + ">");
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getSalary() < amount) {
                System.out.println("ID:" + wizardHogwarts.getId() + " " + wizardHogwarts.getFullName() + ", ЗП:" + wizardHogwarts.getSalary());
            }
        }
    }

    public static void printWizardsWithSalaryGreaterThan(WizardHogwarts[] wizardsHogwarts, double amount) {
        printSeparator();
        System.out.println("<Wizards whose salsry is more than " + amount + ">");
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getSalary() >= amount) {
                System.out.println("ID:" + wizardHogwarts.getId() + " " + wizardHogwarts.getFullName() + ", ЗП:" + wizardHogwarts.getSalary());
            }
        }
    }

}

