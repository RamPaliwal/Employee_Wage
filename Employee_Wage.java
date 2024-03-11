public class Employee_Wage{
	public static void main(String args[]){
		System.out.println("Welcome to Employee Wage program");
		int wage_per_hour = 20;
        	int emp_hours = 0;
        	int present = (int) Math.floor(Math.random()*10)%2;
        	if(present==1){
            		emp_hours = 8;
        	}
        	else{
            		emp_hours=0;
        	}
        	int emp_wage = emp_hours * wage_per_hour;
        	System.out.println(emp_wage);
	}
}