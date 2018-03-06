public class Baby extends Human{
	
	private boolean isTeething;
	
	public boolean getIsTeething(){
		return isTeething;
	}
	public void setIsTeething(boolean isTeething){
		this.isTeething = isTeething;
	}
	
	@Override
	public String swim(){
		return "A baby cannot swim safely";
	}
	
	@Override
	public String sleep(){
		return "The baby isn't sleeping because it's teething!";
	}
	
	public String toString(){
		return super.toString() + "\n" +
				"Teething: " + isTeething;
	}
	
}