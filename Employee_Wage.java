import java.util.Random;

interface IEmployeeWage {
    void calculateWage();
}

class EmployeeWage implements IEmployeeWage {
    private final String company;
    private final int ratePerHr;
    private final int maxWorkingDays;
    private final int maxWorkinghrs;
    private int totalEmpWage;

    public EmployeeWage(String company, int ratePerHr, int maxWorkingDays, int maxWorkinghrs) {
        this.company = company;
        this.ratePerHr = ratePerHr;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkinghrs = maxWorkinghrs;
    }

    @Override
    public void calculateWage() {
        int empHr = 0, totalWorkHrs = 0, totalWorkDays = 0;

        while (totalWorkDays < maxWorkingDays && totalWorkHrs < maxWorkinghrs) {
            totalWorkDays++;
            int empPresent = new Random().nextInt(3);

            switch (empPresent) {
                case 1:
                    empHr = 8; // Full-time
                    break;
                case 2:
                    empHr = 4; // Part-time
                    break;
                default:
                    empHr = 0; // Absent
            }

            totalWorkHrs += empHr;
        }
        totalEmpWage = totalWorkHrs * ratePerHr;
    }

    @Override
    public String toString() {
        return "Details of " + company + " employee\n" +
                "-----------------------------------------------------\n" +
                "Wage per hour: " + ratePerHr + "\n" +
                "Maximum working days: " + maxWorkingDays + "\n" +
                "Maximum working hours: " + maxWorkinghrs + "\n" +
                "Total wage for a month of " + company + " employee is " + totalEmpWage + "\n";
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation Program....");

        IEmployeeWage[] companies = new IEmployeeWage[3];
        companies[0] = new EmployeeWage("Google", 20, 20, 100);
        companies[1] = new EmployeeWage("Microsoft", 18, 20, 120);
        companies[2] = new EmployeeWage("Amazon", 24, 22, 130);

        for(int i = 0; i < companies.length; i++)
        {
            IEmployeeWage company = companies[i];
            company.calculateWage();
            System.out.println(company);
        }

    }
}