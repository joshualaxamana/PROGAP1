
public class Overriding01 {

	public static void main(String[] args) {
		
		PayrollEmployee employee = new PayrollEmployee();
		System.out.println("Employee Salary: " + employee.computeSalary(100, 50));
		
		PayrollEVP evp = new PayrollEVP();
		System.out.println("Employee Salary: " + evp.computeSalary(100, 50));
	}
}

class PayrollEmployee {
	
	public double computeSalary(double dHours, double dRate) {
		return(dHours * dRate);
	}
}

class PayrollEVP extends PayrollEmployee {
		
	public double computeSalary(double dHours, double dRate) {
		//overriding
		return (dHours * dRate * 2);
	}
}
