public class Main{
	
	public static void main(String args[]){
		
		Car c1 = new Car("Hatchback", 53.45f, "89c4545", true);
		java.lang.System.out.println(c1.toString());
		java.lang.System.out.println(c1.brake());
		java.lang.System.out.println(c1.accelerate());
		
		Car c2 = new Car();
		java.lang.System.out.println(c2.toString());
		c2.setManufacturer("Toyota Carola");
		c2.setEngineSize(45.44f);
		c2.setRegistration("90c4343");
		c2.setNct(true);
		java.lang.System.out.println(c2.toString());
		java.lang.System.out.println(c2.brake());
		java.lang.System.out.println(c2.accelerate());
		java.lang.System.out.println(c2.getNumberOfCars());
		
		Truck t1 = new Truck("Ford transit");
		java.lang.System.out.println(t1.toString());
		java.lang.System.out.println(t1.brake());
		java.lang.System.out.println(t1.accelerate());
		
		Truck t2 = new Truck();
		t2.setManufacturer("high undyed pickup");
		t2.setEngineSize(89.45f);
		t2.setNct(true);
		t2.setIsTrailer(false);
		java.lang.System.out.println(t2.toString());
		java.lang.System.out.println(t2.brake());
		java.lang.System.out.println(t2.accelerate());
		
		
		
		
	}
	
}