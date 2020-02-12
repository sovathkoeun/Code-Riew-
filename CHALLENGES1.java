

	// -------------------------------------------------------------
	// CHALLENGE 1   COMMENTS
	// Add comments instead of the TODO :
	//			- comments in the method header
	//			- comments in the method body
	// -------------------------------------------------------------	

	/**
	 * this function use get the positive number from arrayList
	 * @param numbers  use for store arrayList of positive number and use to loop
	 * @return   this return code to give size of positive number
	 */
	int getNumberOfPositiveNumbers(List<Integer> numbers) {
		
		// create ArrayList
		List<Integer> positiveNumbers = new ArrayList<Integer>();
		for(int number : numbers) {
			if (number >= 0 ) {
				positiveNumbers.add(number);
			}
		}
		
		// create positive number and compare to size of positive number
		int numberOfPositiveNumbers = positiveNumbers.size();
		
		// return size of positive number result
		return numberOfPositiveNumbers;
	}
	
	
	
	// -------------------------------------------------------------
	// CHALLENGE 2  COMMENTS
	// Add comments instead of the TODO :
	//			- comments in the method header
	//			- comments in the method body
	// -------------------------------------------------------------

	const NAMES = ["ronan", "rady" /* 100 names here */  ];

	//  radom number of name from array  
	//  @return   display data 
	var getFiveNamesRandomlyCode = () => {

		//  random value from array 
		const NUMBER_OF_NAMES = 5;
		var randomIndexes = [];
		for (let i = 0; i < NUMBER_OF_NAMES; i++) {
		  var randomValue = Math.floor(Math.random() * 100);
		  randomIndexes.push(randomValue);
		}
	  
		// loop random value and display 
		var htmlCode = "";
		for (let i = 0; i < randomIndexes.length; i++) {
		  let name = NAMES[randomIndexes[i]];
		  htmlCode += `<p>${name}</p> `;
		}
		return htmlCode;
	  };
	  
	  
	  
		
	// -------------------------------------------------------------
	// CHALLENGE 3    : DRY
	// Refactor the code with a function to remove duplicated code
	//		- The function shoud take the following prameters:
	//					- List<String> a list of string
	//					- String a name
	//		and return the nunber of times the given name is contained in the given list
	// -------------------------------------------------------------	

	public static void main(String[] args) {
		
		// count the number of banana
		List<String> fruits = Arrays.asList("banana", "banana", "apple", "banana", "mango", "mango");
		int numberOfBanana = 0;
		for(String fruit : fruits) {
			if (fruit.equals("banana")) {
				numberOfBanana++;
			}
		}	
		
		// count the number of tomato
		List<String> vegetables = Arrays.asList("tomato", "potato", "carrot", "tomato", "potato", "tomato");
		int numberOfTomatoes = 0;
		for(String vegetable : vegetables) {
			if (vegetable.equals("tomato")) {
				numberOfTomatoes++;
			}
		}	
				
		// count the number of rith
		List<String> teachers = Arrays.asList("rady", "rith", "rith", "rady", "ronan", "channak");
		int numberOfRith = 0;
		for(String teacher : teachers) {
			if (teacher.equals("rith")) {
				numberOfRith++;
			}
		}	
		
		System.out.println("NUmber of bananas=" + numberOfBanana);
		System.out.println("NUmber of tomatos=" + numberOfTomatoes);
		System.out.println("NUmber of rith=" + numberOfRith);
	}
	
	  
	  
	  
	// -------------------------------------------------------------
	// CHALLENGE 4		MEANING FULL NAMES
	// Rename function /variables  with meaning full names
	// -------------------------------------------------------------	
	boolean isLetterUpercase(String LettersAl) {
		int count = 0;
		for(int i=0; i<LettersAl.length(); i++) {
			char letter = LettersAl.charAt(i);
			
			// Note : Character.isUpperCase(c) return true if c is an uppercase
			if (Character.isUpperCase(letter)){
				count++;
			}
		}
		return count >= 2;
	}
	  