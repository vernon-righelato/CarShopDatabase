
public class Sale {
	
	private Customer customer;
	private Car car;
	
	public Sale(Customer customer, Car car) {		
		this.customer = customer;
		this.car = car;
	}
	public Customer getCustomer() {
		return customer;
	}	
	public Car getCar() {
		return car;
	}
}