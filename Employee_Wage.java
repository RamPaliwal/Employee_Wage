import java.util.ArrayList;


interface IEmployeeWage
{
    void calculateWage();
    String getCompany();
    int getTotalEmpWage();
    int getDailyWage();
}

class EmployeeWage implements IEmployeeWage
{
    private final String company;
    private final int ratePerHr;
    private final int maxWorkingDays;
    private final int maxWorkinghrs;
    private int totalEmpWage;
    private int dailyWage;

    public EmployeeWage(String company, int ratePerHr, int maxWorkingDays, int maxWorkinghrs)
    {
        this.company = company;
        this.ratePerHr = ratePerHr;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkinghrs = maxWorkinghrs;
    }

    @Override
    public void calculateWage() {
        int empHr = 0, totalWorkHrs = 0, totalWorkDays = 0;

        while (totalWorkDays < maxWorkingDays && totalWorkHrs < maxWorkinghrs)
        {
            totalWorkDays++;
            int empPresent = (int) Math.floor(Math.random() * 10) % 3;

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
        int dailyEarned = empHr * ratePerHr;
        dailyWage += dailyEarned;
        totalEmpWage = totalWorkHrs * ratePerHr;
    }

    @Override
    public String getCompany()
    {
        return company;
    }

    @Override
    public int getTotalEmpWage()
    {
        return totalEmpWage;
    }
    public int getDailyWage()
    {
        return dailyWage;
    }



    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program....");

        ArrayList<IEmployeeWage> companies = new ArrayList<>();
        companies.add(new EmployeeWage("Google", 20, 20, 100));
        companies.add(new EmployeeWage("Microsoft", 18, 20, 120));
        companies.add(new EmployeeWage("Amazon", 24, 22, 130));
        companies.add(new EmployeeWage("Accenture", 22, 25, 110));

        for (IEmployeeWage company : companies)
        {
            company.calculateWage();
            System.out.println("Company: " + company.getCompany() + ", Daily Wage: " + company.getDailyWage() + ", Total Wage: " + company.getTotalEmpWage());
        }
    }
}