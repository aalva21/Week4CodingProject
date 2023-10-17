package promineotech;

import java.util.ArrayList;
import java.util.List;

public class CodingProjectW4 {

	public static void main(String[] args) {

		// PART 1
		System.out.println("PART 1");
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; // Array named ages with given values 
		int resultAges = ages[ages.length - 1] - ages[0]; // ages.length - 1 will give access the last element then subtract it by the first element ages[0]
		System.out.println(resultAges); // prints 90 
		
		int[] newAges = new int[ages.length + 1]; // New array that takes 9 elements (1 more than ages)
		int resultNewAges = newAges[newAges.length - 1] - newAges[0]; // newAges.length - 1 will give access the last element then subtract it by the first element newAges[0]
			
		double sum = 0;
		for(int i = 0; i < ages.length; i++) { // enhanced loop that iterates through each element of ages array
			sum += ages[i]; // adds each element to sum
		}
		System.out.println(sum); // prints 230 
		double average = sum / ages.length; // calculates average 
		System.out.println(average + "\n"); // prints average of elements in ages Array

		// PART 2
		System.out.println("PART 2");
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; // Array of String 
		int numberOfChar = 0; // starting point
		
		for(int i = 0; i < names.length; i++) {
			numberOfChar += names[i].length(); // adds the number of characters in each element to numberOfChar 
		}
		System.out.println(numberOfChar); // Prints sum of all characters in each element which equals 23
		double averageChar = (double) numberOfChar / names.length; // Converts into double and calculates average
		System.out.println(averageChar); // Prints the average characters which is 3.83
		
		String combinedNames = ""; // initialize an empty string - gives a starting point 
		
		for(int i = 0; i < names.length; i++) {
			combinedNames += names[i];
			
			if(i < names.length - 1) {
				combinedNames += " "; // Adds a space in between names
			} // end of if statement
		} // End of for loop
		System.out.println(combinedNames + "\n"); // Prints the combined names with a space in between
		
		// PART 3
		System.out.println("PART 3 \nHow do you access the last element of any array?"); // Question #3
		System.out.println("You can use length - 1 to determine last element's index"); // Partial answer to Question #3
		
		int lastPosition = ages.length - 1; // Obtains last index in ages Array
		int lastElement = ages[lastPosition]; // Obtains the last element in that index
		System.out.println(lastElement + "\n"); // Last element of ages Array is 93
		
		// PART 4
		System.out.println("PART 4 \nHow do you access the first element of any array?"); // Question #4
		System.out.println("You can use index 0 to determine first element's position"); // Partial answer to Question #4
		
		int firstPosition = ages[0]; // Obtains element at index 0 being 3 in ages Array
		System.out.println(firstPosition + "\n"); // Prints 3 
		
		// PART 5
		System.out.println("PART 5");
		List<Integer> nameLengths = new ArrayList<>(); // Creates list to store lengths
		
		for(int i = 0; i < names.length; i++) {
			nameLengths.add(names[i].length()); // Obtains length of each name and adds to nameLengths
		}
		System.out.println(nameLengths + "\n"); // prints out lengths of each name (3,5,3,5,4,3)
		
		// PART 6
		System.out.println("PART 6");
		int sumNames = 0;
		for(int i = 0; i < nameLengths.size(); i++) {
			sumNames += nameLengths.get(i); // Sums up all elements in nameLengths
		}
		System.out.println(sumNames + "\n"); // Prints sum (3+5+3+5+4+3 = 23)			
		
		// PART 7b
		String firstString = firstString("Hello", 3); // Calls method firstString
		System.out.println(firstString + "\n");// Will print HelloHelloHello
		
		// PART 8b
		String fullName = fullName("Alejandro", "Alvarez"); // Calls method fullName
		System.out.println(fullName + "\n");
		
		// PART 9b
		System.out.println("PART 9");
		int[] numbersTest = {1,2,3,4,5}; // Sum is NOT Greater than 100
		boolean sumAll = sumOfInts(numbersTest); // Calls method sumOfInts
		System.out.println(sumAll); // Returns false
		
		int[] numbersTest2 = {534, 100, 393, 449, 679}; // Sum IS greater than 100
		boolean sumAll2 = sumOfInts(numbersTest2); // Calls method sumOfInts
		System.out.println(sumAll2 + "\n"); // Returns true 
		
		// PART 10b
		System.out.println("PART 10");
		double[] numbersTest1a = {1,2,3,4,5}; // Average is 3
		double averageTest1a = averageCalculation(numbersTest1a); // calls method averageCalculation
		System.out.println(averageTest1a); // Prints 3.0 
		
		double[] numbersTest2a = {5,10,20,40,80}; // Average is 31
		double averageTest2a = averageCalculation(numbersTest2a); // calls method averageCalculation
		System.out.println(averageTest2a + "\n"); // Prints 31.0
		
		// PART 11b
		System.out.println("PART 11");
		double[] firstArray = {1,2,3,4,5}; // average is less than secondArray
		double[] secondArray = {5,23,12,35,1}; // average is more than firstArray
		
		boolean averageOfArrays = averageArrays(firstArray, secondArray); // Calls method averageArrays
		System.out.println(averageOfArrays + "\n"); // prints false because firstArray average is less than secondArray
		
		// PART 12b
		System.out.println("PART 12");
		boolean isHotOutside = true;
		double moneyInPocket = 5;
		
		boolean buyIt = willBuyDrink(isHotOutside, moneyInPocket); // Calls willBuyDrink method
		System.out.println(buyIt + "\n"); // returns false because 5 is less than 10.50 
		
		// PART 13b
		System.out.println("PART 13");
		int pointsGame1 = 32;
		int pointsGame2 = 19;
		int pointsGame3 = 10;
		double pointsAverage = (pointsGame1 + pointsGame2 + pointsGame3) / 3; // calculates average points 
		double isPointGuard = basketballPG(pointsGame1, pointsGame2, pointsGame3, pointsAverage); // Calls basketballPG method
		
		
	} // end of main
	
	// PART 7a
	public static String firstString(String word, int n) {
		System.out.println("PART 7");
		String newResult = "";
		
		for(int i = 0; i < n; i++) {
			newResult += word;
		}
		return newResult;
	} // end of averageCalculation method
	
	// PART 8a
	public static String fullName(String firstName, String lastName) {
		System.out.println("PART 8");
		return firstName + " " + lastName; // returns first and last name with a space in between both Strings
	} // end of fullName method
	
	// PART 9a
	public static boolean sumOfInts(int[] nums) {
		int sum = 0; 
		
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i]; // Adds value of current element into sum
		}
		return sum > 100; // this checks whether the sum is greater than 100 and returns accordingly (true or false)	
	} // end of sumOfInts method
	
	// PART 10a
	public static double averageCalculation(double[] nums) {
	
		double sum = 0.0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i]; // Adds value of current element into sum
		}
		return sum / nums.length; // calculates for average and returns average #
	} // end of averageCalculation method
	
	// PART 11a
	public static boolean averageArrays (double[] firstArray, double[] secondArray) {
		
		double sum = 0.0;
		double sum2 = 0.0;
		
		for(int i = 0; i < firstArray.length; i++) {
			sum += firstArray[i]; // Adds value of current element into sum
		}
		
		for(int i = 0; i < secondArray.length; i++) {
			sum2 += secondArray[i]; // Adds value of current element into sum2
		}
		
		double averageSum = sum / firstArray.length;
		double averageSum2 = sum2 / secondArray.length;
		
		return averageSum > averageSum2; // compares averages and returns true if averageSum is greater than averageSum2 or false if it is not
		
	} // end of averageArrays method 
	
	// PART 12a
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		
		return isHotOutside && moneyInPocket > 10.50;
		
	} // end of willBuyDrink method
	
	// PART 13a
	public static double basketballPG(int pointsGame1, int pointsGame2, int pointsGame3, double pointsAverage) { 
		// this method determines if basketball player will be a Point Guard (PG) if they average 20+ points
	
		if(pointsAverage >= 20) {
			System.out.println("You are a Point Guard!"); // if average points is 20 or more, it will print you are a PG!
		} else {
			System.out.println("You are not a Point Guard!"); // if average points is less than 20, it will print you are NOT a PG!
		}
		return pointsAverage; // Returns true if the player is a Point Guard, returns false if not
		
	} // end of basketballPG method
	
	
} // End of class
