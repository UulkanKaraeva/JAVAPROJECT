
public class StaticTest {
	private static int numInstance=0;
	private String name;
	
	public StaticTest(String name) {
		this.name=name;
		numInstance++;
	}
	public int getNumInstance() {
		return numInstance;
		
	}
	public String Name() {
		return name;
	}

}
