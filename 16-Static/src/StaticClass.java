public class StaticClass {
	public static void main(String[] args) {
StaticTest static1 = new StaticTest("Instance-1");
	System.out.println(static1.getName()+ " is instance number "+static1.getNumInstance() );
	
	StaticTest static2 = new StaticTest("Instance-2");
	System.out.println(static2.getName()+ " is instance number "+static2.getNumInstance());
	
	StaticTest static3 = new StaticTest("Instance-3");
System.out.println(static3.getName()+ " is instance number "+static3.getNumInstance() );
