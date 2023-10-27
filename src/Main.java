public class Main {
    public static void main(String[] args) {

        WizardHogwarts[] wizardsHogwarts = new WizardHogwarts[10];

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


        WizardHogwarts.printAllWizards(wizardsHogwarts);
        WizardHogwarts.calculateTotalSalary(wizardsHogwarts);
        WizardHogwarts.findMinimumSalary(wizardsHogwarts);
        WizardHogwarts.findMaximumSalary(wizardsHogwarts);
        WizardHogwarts.calculateAverageSalary(wizardsHogwarts);
        WizardHogwarts.printAllWizardName(wizardsHogwarts);


        WizardHogwarts.indexSalary(wizardsHogwarts, 15);
        WizardHogwarts.findEmployeeMinSalaryDepartment(wizardsHogwarts, 2);
        WizardHogwarts.findEmployeeMaxSalaryDepartment(wizardsHogwarts, 4);
        WizardHogwarts.calculateTotalSalaryDepartment(wizardsHogwarts, 1);
        WizardHogwarts.calculateAverageSalaryByDepartment(wizardsHogwarts, 3);
        WizardHogwarts.indexSalaryDepartment(wizardsHogwarts, 5, 10);
        WizardHogwarts.printWizardsDepartment(wizardsHogwarts, 1);
        WizardHogwarts.printWizardsWithSalaryLessThan(wizardsHogwarts, 130_000);
        WizardHogwarts.printWizardsWithSalaryGreaterThan(wizardsHogwarts, 500_000);
        WizardHogwarts.printSeparator();
    }
}
