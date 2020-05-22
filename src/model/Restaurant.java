package model;

public class Restaurant {
	int restaurantId;
	String restaurantName;
	String cuisines;
	double restaurantRatings;
	double healthCertificationRatings;
	String reataurantArea;
	int seatAvailability;
	
	
	public Restaurant(int rId, String rName, String cuisine, double rRating, double hcRating, String rArea, int seatAvailable) {
		this.restaurantId=rId;
		this.restaurantName=rName;
		this.cuisines=cuisine;
		this.restaurantRatings=rRating;
		this.healthCertificationRatings=hcRating;
		this.reataurantArea=rArea;
		this.seatAvailability=seatAvailable;
		
	}
	public int getSeatAvailability() {
		return seatAvailability;
	}
	public void setSeatAvailability(int seatAvailability) {
		this.seatAvailability = seatAvailability;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getCuisines() {
		return cuisines;
	}
	public void setCuisines(String cuisines) {
		this.cuisines = cuisines;
	}
	public double getRestaurantRatings() {
		return restaurantRatings;
	}
	public void setRestaurantRatings(double restaurantRatings) {
		this.restaurantRatings = restaurantRatings;
	}
	public double getHealthCertificationRatings() {
		return healthCertificationRatings;
	}
	public void setHealthCertificationRatings(double healthCertificationRatings) {
		this.healthCertificationRatings = healthCertificationRatings;
	}
	public String getReataurantArea() {
		return reataurantArea;
	}
	public void setReataurantArea(String reataurantArea) {
		this.reataurantArea = reataurantArea;
	}
}
