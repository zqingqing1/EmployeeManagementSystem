package App;

import model.Employee;
import observe.EmployeeManagementSystem;
import observe.HRDeparment;
import observe.Observer;
import observe.PayrollDeparment;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		Employee emp = new Employee("bob",2);
		
		Observer HR = new HRDeparment();
		Observer payroll = new PayrollDeparment();
		
		ems.registerObserver(HR);
		ems.registerObserver(payroll);
		
		ems.addNewEmployee(emp);
		
		
		ems.removeEmployee(emp);

	}

}
