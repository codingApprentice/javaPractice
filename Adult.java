public class Adult extends Human{
	
	private String ppsNo;
	private String occupation;
	private boolean isMarried;
	private boolean isCarOwner;
	
	//getter and setter methods
	//PPS number
	public String getPpsNo(){
		return ppsNo;
	}
	public void setPpsNo(String ppsNo){
		this.ppsNo = ppsNo;
	}
	
	//occupation
	public String getOccupation(){
		return occupation;
	}
	public void setOccupation(String occupation){
		this.occupation = occupation;
	}
	
	//are they married
	public boolean getIsMarried(){
		return isMarried;
	}
	public void setIsMarried(boolean isMarried){
		this.isMarried = isMarried;
	}
	
	//do they own a car
	public boolean getIsCarOwner(){
		return isCarOwner;
	}
	public void setIsCarOwner(boolean isCarOwner){
		this.isCarOwner = isCarOwner;
	}
	
	//Add methods
	public String drive(){
		return "Driving a car safely…";
	}
	public String procreate(){
		return "Procreating…";
	}
	
	public String toString(){
		return super.toString() + "\n" +
				"Occupation: " + occupation + "\n" +
				"PPS number: " + ppsNo + "\n" +
				"Marriage status:" + isMarried + "\n" +
				"Car owner: " + isCarOwner;
	}
	
}