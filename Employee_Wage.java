import java.util.Random;

interface IEmployeeWage {
    void calculateWage();
    String getCompany();
    int getTotalEmpWage();
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
            int empPresent =(int) Math.floor(Math.random() * 10) % 3;

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
    public String getCompany() {
        return company;
    }

    @Override
    public int getTotalEmpWage() {
        return totalEmpWage;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation Program....");

        IEmployeeWage[] companies = new IEmployeeWage[3];
        companies[0] = EmployeeWageAPI.createEmployeeWage("Google", 20, 20, 100);
        companies[1] = EmployeeWageAPI.createEmployeeWage("Microsoft", 18, 20, 120);
        companies[2] = EmployeeWageAPI.createEmployeeWage("Amazon", 24, 22, 130);

        for (IEmployeeWage company : companies)
        {
            company.calculateWage();
            System.out.println("Company: " + company.getCompany() + ", Total Wage: " + company.getTotalEmpWage());
        }
    }
}

class EmployeeWageAPI {
    private EmployeeWageAPI() {}

    public static IEmployeeWage createEmployeeWage(String company, int ratePerHr, int maxWorkingDays, int maxWorkinghrs)
    {
        return new EmployeeWage(company, ratePerHr, maxWorkingDays, maxWorkinghrs);
    }
}