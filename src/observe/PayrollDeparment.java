package observe;

public class PayrollDeparment implements Observer{
	@Override
	public void callme(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Payroll notified");
		System.out.println(msg);
	}
}
