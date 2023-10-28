public class Main {

    private static WizardHogwarts[] wizardsHogwarts = new WizardHogwarts[10];
    public static void main(String[] args) {

        wizardsHogwarts[0] = new WizardHogwarts("Albus Dumbledore", 1, 1_000_000);
        wizardsHogwarts[1] = new WizardHogwarts("Severus Snape", 2, 250_000);
        wizardsHogwarts[2] = new WizardHogwarts("Minerva McGonsgall", 1, 350_000);
        wizardsHogwarts[3] = new WizardHogwarts("Alastor Moody", 2, 200_000);
        wizardsHogwarts[4] = new WizardHogwarts("Horace Slughorn", 3, 210_000);
        wizardsHogwarts[5] = new WizardHogwarts("Dolores Umbridge", 5, 400_000);
        wizardsHogwarts[6] = new WizardHogwarts("Gilderoy Lockhart", 4, 150_000);
        wizardsHogwarts[7] = new WizardHogwarts("Quirinus Quirrell",5, 100_000);
        wizardsHogwarts[8] = new WizardHogwarts("Remus Lupin", 2, 170_000);
        wizardsHogwarts[9] = new WizardHogwarts("Rolanda Hooch",4, 330_000);


        printAllWizards();
        calculateTotalSalary();
        findMinimumSalary();
        findMaximumSalary();
        calculateAverageSalary();
        printAllWizardName();


        indexSalary(15);
        findEmployeeMinSalaryDepartment( 2);
        findEmployeeMaxSalaryDepartment(4);
        calculateTotalSalaryDepartment(1);
        calculateAverageSalaryByDepartment(3);
        indexSalaryDepartment(5, 10);
        printWizardsDepartment(1);
        printWizardsWithSalaryLessThan(130_000);
        printWizardsWithSalaryGreaterThan(500_000);
    }

    public static void printAllWizards() {

        System.out.println("<List of all Hogwarts wizards>");
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            System.out.println(wizardHogwarts);
        }
    }

    public static double calculateTotalSalary() {
        double totalSalary = 0;
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts){
            totalSalary += wizardHogwarts.getSalary();
        }
        System.out.println("Total salary per month: " + totalSalary);
        return totalSalary;
    }

    public static WizardHogwarts findMinimumSalary() {
        WizardHogwarts minSalary = wizardsHogwarts[0];
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getSalary() < minSalary.getSalary()) {
                minSalary = wizardHogwarts;
            }
        }
        System.out.println("Lowest salary: " + minSalary.getFullName());
        return minSalary;
    }

    public static WizardHogwarts findMaximumSalary() {
        WizardHogwarts maxSalary = wizardsHogwarts[0];
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getSalary() > maxSalary.getSalary()) {
                maxSalary = wizardHogwarts;
            }
        }
        System.out.println("Highest salary: " + maxSalary.getFullName());
        return maxSalary;
    }

    public static double calculateAverageSalary() {
        double totalSalary = 0;
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts){
            totalSalary += wizardHogwarts.getSalary();
        }
        double averageSalary = totalSalary / wizardsHogwarts.length;
        System.out.println("Average salary: " + averageSalary);
        return averageSalary;
    }

    public static  void printAllWizardName() {
        System.out.println("<Names of all wizards>");
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            System.out.println(wizardHogwarts.getFullName());
        }
    }

    public static void indexSalary(double percentage) {
        System.out.println("<Salary increase by " + percentage + " percent>");
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            double salaryIncrease = wizardHogwarts.getSalary() * (percentage / 100);
            wizardHogwarts.setSalary(wizardHogwarts.getSalary() + salaryIncrease);
            System.out.println(wizardHogwarts.getFullName() + " "  + wizardHogwarts.getSalary());
        }

    }

    public static WizardHogwarts findEmployeeMinSalaryDepartment(int department) {
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

    public static WizardHogwarts findEmployeeMaxSalaryDepartment(int department) {
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

    public static int calculateTotalSalaryDepartment(int department) {
        int totalSalaryDepartment = 0;
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getDepartment() == department) {
                totalSalaryDepartment += wizardHogwarts.getSalary();
            }
        }
        System.out.println("In department " + department + " spent on salaries: " + totalSalaryDepartment);
        return totalSalaryDepartment;
    }

    public static double calculateAverageSalaryByDepartment(int department) {
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

    public static void indexSalaryDepartment(int department, double percentage) {
        System.out.println("<New salaries in department " + department + ">");
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getDepartment() == department) {
                double salaryIncrease = wizardHogwarts.getSalary() * (percentage / 100);
                wizardHogwarts.setSalary(wizardHogwarts.getSalary() + salaryIncrease);
                System.out.println(wizardHogwarts.getFullName() + " "  + wizardHogwarts.getSalary());
            }
        }
    }

    public static void printWizardsDepartment(int department) {
        System.out.println("<Data of the wizards from the " + department + "rd department>");
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getDepartment() == department) {
                System.out.println("ID:" + wizardHogwarts.getId() + " " + wizardHogwarts.getFullName() + ", ЗП:" + wizardHogwarts.getSalary());
            }
        }
    }

    public static void printWizardsWithSalaryLessThan( double amount) {
        System.out.println("<Wizards whose salsry is less than " + amount + ">");
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getSalary() < amount) {
                System.out.println("ID:" + wizardHogwarts.getId() + " " + wizardHogwarts.getFullName() + ", ЗП:" + wizardHogwarts.getSalary());
            }
        }
    }

    public static void printWizardsWithSalaryGreaterThan(double amount) {
        System.out.println("<Wizards whose salsry is more than " + amount + ">");
        for (WizardHogwarts wizardHogwarts : wizardsHogwarts) {
            if (wizardHogwarts.getSalary() >= amount) {
                System.out.println("ID:" + wizardHogwarts.getId() + " " + wizardHogwarts.getFullName() + ", ЗП:" + wizardHogwarts.getSalary());
            }
        }
    }
}
