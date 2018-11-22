
public class Main {

	public static void main(String[] args) {
		
		//DeskPhone mikePhone = new DeskPhone(20220202,true);
		
		ITelephone mikePhone = new DeskPhone(20220202,true);
		mikePhone.powerOn();
		mikePhone.callPhone(55555);
		mikePhone.answer();
		
	}

}
