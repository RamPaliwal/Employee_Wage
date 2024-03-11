public class Employee_Wage{
	public static final int wage_per_hour = 20;
        public static final int emp_part_time=1;
        public static final int emp_full_time=2;
    	public static void main(String[] args) {
        int emp_hours = 0;
        int present = (int) Math.floor(Math.random()*10)%3;
        switch (present) {
            case emp_full_time:
                emp_hours=8;
                break;

            case emp_part_time:
                emp_hours=4;
        
            default:
                emp_hours=0;
                break;
        }
        int emp_wage = emp_hours * wage_per_hour;
        System.out.println(emp_wage);
    }
}