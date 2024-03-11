public class Employee_Wage{
	public static void main(String args[]){
		System.out.println("Welcome to Employee Wage program");
		int wage_per_hour = 20;
        	int emp_hours = 0;
        	int emp_part_time=1;
        	int emp_full_time=2;
        	int present = (int) Math.floor(Math.random()*10)%3;
        	if(present==emp_full_time){
            		emp_hours = 8;
        	}
        	else if(present==emp_part_time){
            		emp_hours=4;
        	}
        	else{
            		emp_hours=0;
        	}
        	int emp_wage = emp_hours * wage_per_hour;
        	System.out.println(emp_wage);
	}
}