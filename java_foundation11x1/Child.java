public class Child extends Human{
	
	private String schoolCardNumber = "N/A";
	
	//getter and setter methods
	//school card number
	public String getSchoolCardNumber(){
		return schoolCardNumber;
	}
	public void setSchoolCardNumber(){
		this.schoolCardNumber = schoolCardNumber;
	}
	
	@Override
	public String swim(){
		
		if(getAge()<=5) {
			return "As the child is 5 years old or younger, " +
			"armbands must be worn and parental supervision is required." +
			"Arms rotating and pushing the body forward…";
		}
		else {
			return super.swim();
		}
		
	}
		
	public String toString(){
		return super.toString() + "\n" +
				"School Card Number: " + schoolCardNumber;
	}
	
}