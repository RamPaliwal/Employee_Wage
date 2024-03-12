public class Employee_Wage{
	public static final int emp_part_time=1;
	public static final int emp_full_time=2;
	public final String company;
	public final int wage_per_hour;
	public final int total_num_of_days;
	public final int total_hours;
	public int total_wage;
	
	public Employee_Wage(String company,int wage_per_hour,int total_num_of_days,int total_hours) {
		this.company = company;
		this.wage_per_hour = wage_per_hour;
		this.total_num_of_days=total_num_of_days;
		this.total_hours=total_hours;
	}
	public void Calculate_Wage() {
    	int emp_hours = 0;
    	int emp_working_hours=0;
    	int total_work_days=0;
    	while(emp_working_hours<=total_hours && total_work_days<=total_num_of_days){
        		total_work_days++;
        		int present = (int) Math.floor(Math.random()*10)%3;
    		switch (present) {
        			case emp_full_time:
            			emp_hours=8;
            			break;

        			case emp_part_time:
            			emp_hours=4;
				break;
    
        			default:
            			emp_hours=0;
            			break;
        		}
        emp_working_hours += emp_hours;
    	}
   	total_wage = emp_working_hours * wage_per_hour;
	}
	
	public String toString() {
		return "Total Employee wage for company "+company+" is "+total_wage;
	}

	public static void main(String[] args) {
		Employee_Wage jio = new Employee_Wage("Jio",40,25,20);
		jio.Calculate_Wage();
		System.out.println(jio);
		Employee_Wage dmart = new Employee_Wage("DMart",20,20,10);
		dmart.Calculate_Wage();
		System.out.println(dmart);
	}
}