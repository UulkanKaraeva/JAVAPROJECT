
public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "is");
	}

}
