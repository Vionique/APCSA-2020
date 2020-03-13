package dataLab;

public class RestaurantData{
	private String name;
	private String neighborhood;
	private String policedistrict;
	private int zipcode;
	private int councildistrict;
	
	public RestaurantData(String nm, String neighbor, String police, int zip, int council) {
		this.name = nm;
		this.neighborhood = neighbor;
		this.policedistrict = police;
		this.zipcode = zip;
		this.councildistrict = council;
	}
	
	public String getName() {
		return name;
	}
	public String getNeighbor() {
		return neighborhood;
	}
	public String getPolice() {
		return policedistrict;
	}
	public int getZipcode() {
		return zipcode;
	}
	
	public boolean isInNeighborhood(String n) {
		return this.neighborhood.equalsIgnoreCase(n);
	}
}
