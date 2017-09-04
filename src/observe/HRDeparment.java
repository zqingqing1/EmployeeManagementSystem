package observe;

public class HRDeparment implements Observer{

	public HRDeparment(){
		
	}
	
	@Override
	public void callme(String msg) {
		// TODO Auto-generated method stub
		System.out.println("HR notified");
		System.out.println(msg);
	}

}
