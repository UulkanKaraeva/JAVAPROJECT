package Computer;

public class Motherboard {
	
	private String model;
	private String manifacture;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	
	public Motherboard(String model,String manufacturer, int ramSlots,int cardSlots,String bios) {

}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManifacture() {
		return manifacture;
	}

	public void setManifacture(String manifacture) {
		this.manifacture = manifacture;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public void setRamSlots(int ramSlots) {
		this.ramSlots = ramSlots;
	}

	public int getCardSlots() {
		return cardSlots;
	}

	public void setCardSlots(int cardSlots) {
		this.cardSlots = cardSlots;
	}

	public String getBios() {
		return bios;
	}

	public void setBios(String bios) {
		this.bios = bios;
	}
}