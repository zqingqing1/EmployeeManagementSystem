package observe;

import java.util.LinkedList;
import java.util.List;

import model.Employee;

public class EmployeeManagementSystem implements Subject{
	//private Employee emp;
	private String msg;
	List<Observer> list;
	List<Employee> emps;
	
	
	public EmployeeManagementSystem() {
		this.msg = null;
		this.list = new LinkedList<>();
		this.emps = new LinkedList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		list.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		list.remove(o);
	}

	@Override
	public void notifyObsevers() {
		// TODO Auto-generated method stub
		for(Observer o:list){
			o.callme(msg);
		}
	}
	
	public void addNewEmployee(Employee emp){
		emps.add(emp);
		msg = emp.getName()+" get hired!";
		notifyObsevers();
	}
	
	public void removeEmployee(Employee emp){
		emps.remove(emp);
		msg = emp.getName()+" get terminated!";
		notifyObsevers();
	}
	

}
