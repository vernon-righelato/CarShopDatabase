
public class Car {
	
	private String make;
	private String model;
	private String registration;
	public Car(String make, String model, String registration) {
		
		this.make = make;
		this.model = model;
		this.registration = registration;
	}
	public String getDetails() {
		return make + " " + model +  " " + registration;
	}		
}