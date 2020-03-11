package dataLab;

public class Cereal {
	String name;
	int carb;
	int protein;
	public Cereal() {
		setName("air cereal");
		setCarb(0);
		setProtein(0);
	}
	
	public Cereal(String nm, int c, int p) {
		setName(nm);
		setCarb(c);
		setProtein(p);
	}
	
	public static void main (String[] args) {
		Cereal one = new Cereal();
		Cereal two = new Cereal("Apple Jacks", 11, 2);
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(two.compNutrition());
		
	}
	
	public void setName(String nm) {
		name = nm;
	}
	public void setCarb(int c) {
		carb = c;
	}
	public void setProtein(int p) {
		protein = p;
	}
	
	public String getName() {
		return name;
	}
	public int getCarb() {
		return carb;
	}
	public int getProtein() {
		return protein;
	}
	
	public String compNutrition() {
		if (carb / protein >= 3)
			return name + " is not good for a low carb, high protein diet.";
		else
			return name + " is good for a low carb, high protein diet.";
	}
	
	public String toString() {
		return name + " has " + carb + " g of carbs and " + protein + " g of protein.";
	}
}
