public class Car extends Vehicle{
	
	private static int numberOfCars;
	
	public static int getNumberOfCars(){
		return numberOfCars;
	}
	
	public Car(String manufacturer, float engineSize, String registration, boolean nct){
		super(manufacturer, engineSize, registration, nct);
		numberOfCars++;
	}
	public Car(String manufacturer, float engineSize, String registration){
		this(manufacturer, engineSize, registration, false);
		
	}
	public Car(String manufacturer, float engineSize){
		this(manufacturer, engineSize, "not specified", false);
		
	}
	public Car(String manufacturer){
		this(manufacturer, 0.0f, "not specified", false);
		
	}
	public Car(){
		this("not specified", 0.0f, "not specified", false);
		
	}
	
	@Override
	public String brake(){
		return "Car braking.";
	}
	
	
	
}