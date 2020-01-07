import java.util.ArrayList;

public class Database {	
	
	private ArrayList<Car> cars = new ArrayList<>();
	private ArrayList<Customer> customers = new ArrayList<>();	
	private static Database databaseInstance = null;
	
	private Database() {}
	
	public static Database getInstance() {
		if(databaseInstance == null) {
			databaseInstance = new Database();
		}
		return databaseInstance;
	}
	
	public void addCar(Car c) {
		cars.add(c);
	}
	public Car getCar(int i) {
		return cars.get(i);
	}
	public void printCars() {
		for(int i = 0; i < cars.size(); i ++) {
			System.out.println( i + " " + cars.get(i).getDetails());
		}	
	}
	public void addCustomer(Customer c) {
		customers.add(c);
	}
	public Customer getCustomer(int i) {
		return customers.get(i);
	}
	public void printCustomers() {
		for(int i = 0; i < customers.size(); i ++) {
			System.out.println( i + " " + customers.get(i).getCustomerName());
		}	
	}	
}
