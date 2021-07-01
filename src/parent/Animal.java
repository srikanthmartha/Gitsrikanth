package parent;

public class Animal {
	
	//Height weight AnimalType Blood
	private int weight;
	private String animalType;
	private String Blood;
	private int height;
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	public String getAnimalType() {
		return animalType;
	}
	public String getBlood() {
		return Blood;
	}
	
	public Animal(int height, int weight, String animalType, String blood) {
		super();
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		Blood = blood;
	}
	public String showinfo() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
