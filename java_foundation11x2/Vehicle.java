public class Vehicle{
	
	private String manufacturer;
	private float engineSize;
	private String registration;
	private boolean nct;
	
	public String getManufacturer(){
		return manufacturer;
	}
	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}
	
	public float getEngineSize(){
		return engineSize;
	}
	public void setEngineSize(float engineSize){
		this.engineSize = engineSize;
	}
	
	public String getRegistration(){
		return registration;
	}
	public void setRegistration(String registration){
		this.registration = registration;
	}
	
	public boolean getNct(){
		return nct;
	}
	public void setNct(boolean nct){
		this.nct = nct;
	}
	
	public Vehicle(String manufacturer, float engineSize, String registration, boolean nct){
		this.manufacturer = manufacturer;
		this.engineSize = engineSize;
		this.registration = registration;
		this.nct = nct;
	}
	public Vehicle(String manufacturer, float engineSize, String registration){
		this(manufacturer, engineSize, registration, false);
	}
	public Vehicle(String manufacturer, float engineSize){
		this(manufacturer, engineSize, "not specified", false);
	}
	public Vehicle(String manufacturer){
		this(manufacturer, 0.0f, "not specified", false);
	}
	public Vehicle(){
		this("not specified", 0.0f, "not specified", false);
	}

	public String accelerate(){
		return "Accelerating...";
	}
	public String brake(){
		return "Vehicle braking...";
	}
		
	public String toString(){
		return "Manufacturer: " + manufacturer + "\n" +
				"Engine Size: " + engineSize + "\n" +
				"Registration Number: " + registration + "\n" +
				"NCT: " + nct;
	}
		
}