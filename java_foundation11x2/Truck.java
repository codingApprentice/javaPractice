public class Truck extends Vehicle{
	
	private boolean isTrailer;
	
	public boolean getIsTrailer(){
		return isTrailer;
	}
	public void setIsTrailer(boolean isTrailer){
		this.isTrailer = isTrailer;
	}
	
	public Truck(String manufacturer, float engineSize, String registration, boolean nct){
		super(manufacturer, engineSize, registration, nct);
	}
	public Truck(String manufacturer, float engineSize, String registration){
		this(manufacturer, engineSize, registration, false);
	}
	public Truck(String manufacturer, float engineSize){
		this(manufacturer, engineSize, "not specified", false);
	}
	public Truck(String manufacturer){
		this(manufacturer, 0.0f, "not specified", false);
	}
	public Truck(){
		this("not specified", 0.0f, "not specified", false);
	}
	
	@Override
	public String brake(){
		return "Truck braking";
	}
	
	@Override
	public String toString(){
		return super.toString() + "\n" +
				"Trailer: " + isTrailer;
	}
	
}