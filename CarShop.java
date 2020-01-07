
public class CarShop {

	public static void main(String[] args) {
		
		Database db = Database.getInstance();
		UserInterface ui = UserInterface.getInstance(db);
		ui.run();	
		
		Database db2 = Database.getInstance();
		db2.printCars();
	}
}