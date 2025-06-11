package ex07;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.drive(bus);
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
		Vehicle vehicle = new Vehicle();
		driver.drive(vehicle);
		
		
		
		
		
		
		

	}

}
