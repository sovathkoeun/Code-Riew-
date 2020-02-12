
// -------------------------------------------------------------
// CHALLENGE 1   MAGIC NUMBERS
//  Refactor this code to name explicitely all magic numbers
// -------------------------------------------------------------	
public class TimeLibrary {
	public static int getNumberOfMinutes(int nbSeconds) {
		final int SECONDS_PER_MINUTE = 60;
		return nbSeconds / SECONDS_PER_MINUTE;
	}
	
	public static int getNumberOfHours(int nbSeconds) {
		final int SECONDS_PER_HOUR = 3600;
		return nbSeconds / SECONDS_PER_HOUR;
	}
	
	public static int getNumberOfDays(int nbSeconds) {
		final int SECONDS_PER_HOUR = 3600;
		final int HOUR_PER_DAY = 24;
		return nbSeconds / (SECONDS_PER_HOUR * HOUR_PER_DAY);
	}	
}


// -------------------------------------------------------------
// CHALLENGE 2   MAGIC NUMBERS
//  Refactor this code to name explicitely all magic numbers
// -------------------------------------------------------------	
	  

/**
 * Return true if given day is a day for code review
 * @param day the day in the week - 0 for Monday ...
 * @return true if the given day is a day where WEB-B or WEP-A has code review
 */
public static boolean thisIsDayForCodeReview(int day) {
	final int MONDAY = 0; 
	final int WENESDAY = 2;
	return day == MONDAY || day == WENESDAY;
}	  