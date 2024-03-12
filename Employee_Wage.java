public class Employee_Wage{
	public static final int emp_part_time=1;
	public static final int emp_full_time=2;
	
	public static int Calculate_Wage(String name, int wage_per_hour, int total_num_of_days, int total_hours) {
    	int emp_hours = 0;
    	int emp_working_hours=0;
    	int total_wage=0;
    	int total_work_days=0;
    	while(emp_working_hours<=total_hours && total_work_days<total_num_of_days){
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
    	return total_wage;
	}
	
	public static void main(String[] args) {
		System.out.println(Employee_Wage.Calculate_Wage("Jio",40,25,20));
	}
}