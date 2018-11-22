package Computer;

public class Monitor {
	
	private String model;
	private String manufacturer;
	private int size;
	private Resolution resolution1; 
	
	public Monitor(String model, String manufacturer, int size, Resolution resolution1) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.resolution1 = resolution1;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setResolution1(Resolution resolution1) {
		this.resolution1 = resolution1;
	}

}