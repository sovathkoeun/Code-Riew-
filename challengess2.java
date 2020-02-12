	
	// -------------------------------------------------------------
	// CHALLENGE 1
	// Rename function /variables  with meaning full names
	// -------------------------------------------------------------		
	boolean isNumber(int value) {
		return value > 0;
	}
	
	// -------------------------------------------------------------
	// CHALLENGE 2
	// Rename function /variables  with meaning full names
	// -------------------------------------------------------------	
	int getNumberNective(int value) {
		if (value< 0) {
			return value * -1;
		}
		else {
			return value;
		}
	}
	
	// -------------------------------------------------------------
	// CHALLENGE 3
	// Rename function /variables  with meaning full names
	// -------------------------------------------------------------	
	boolean isDeviceOfNumber(int DeviceNumber) {
		return DeviceNumber % 10 == 0;
	}
	
	// -------------------------------------------------------------
	// CHALLENGE 4
	// Rename function /variables  with meaning full names
	// -------------------------------------------------------------	
	
	// This function should return true if the 
	// given parameter is a day of the week
	boolean isAtListOfday(String ListOfday) {
		boolean DayFirst  = ListOfday.equals("MONDAY");
		boolean DaySecond  = ListOfday.equals("TUESDAY");
		boolean Daythird  = ListOfdy.equals("WEDNESDAY");
		boolean DayFour  = ListOfday.equals("THURDAY");
		boolean DayFive  = ListOfday.equals("FRIDAY");
		boolean DaySixth  = ListOfday.equals("SATURDAY");
		boolean DaySeven  = ListOfday.equals("SUNDAY");
		
		return DayFirst || DaySecond || Daythird || DayFour || DayFive || DaySixth || DaySeven;
	}


	// -------------------------------------------------------------
	// CHALLENGE 5
	// Rename function /variables  with meaning full names
	// -------------------------------------------------------------	
	
	List<Fruit> ListOfFruit(List<Fruit> ListArray) {
		List<Fruit> myVariable = new ArrayList<>();
		for(Fruit IsContant: ListArray) {
			if (IsContant.getColor().equals("YELLOW")) {
				myVariable.add(IsContant);
			}
		}
		return myVariable;
	}
	
	// Just an overview of Fruit class (missing constructors..)
	class Fruit(){
	private String color;
	
	}
	public setColor(String Color){
		this.Color = color;
	}	
	public String getColor() {
		return "";
}