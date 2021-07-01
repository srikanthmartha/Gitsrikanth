package child;

import parent.Animal;

public class Fish extends Animal {

	public String showinfo() {
		return "Fish [liveinwater=" + liveinwater + ", hasgills=" + hasgills + ", getLiveinwater()=" + getLiveinwater()
				+ ", getHasgills()=" + getHasgills() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()
				+ ", getAnimalType()=" + getAnimalType() + ", getBlood()=" + getBlood() + "]";
	}
private String liveinwater;
public String getLiveinwater() {
	return liveinwater;
}
public String getHasgills() {
	return hasgills;
}
private String hasgills;
public Fish(int height, int weight, String animalType, String blood) {
	super(height, weight, animalType, blood);
	// TODO Auto-generated constructor stub
}




}
