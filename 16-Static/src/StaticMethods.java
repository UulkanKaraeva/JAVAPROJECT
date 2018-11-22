
public class StaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc.show1();
		
		Abc x = new Abc();
		x.show2();

	}

}

class Abc{
	
	public static void show1() {
		System.out.println("hi");
		show2();
		show4();
	}
	
	public static void show2() {
		System.out.println("hi");
		show1();
	
}

	public static void show3() {
		System.out.println("hi");
		show2();
		show1();
		
	}
	
	public static void show4() {
		System.out.println("hi");
	}
}
	