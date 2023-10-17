package promineotech;

import java.io.*;
import java.util.*;

public class ResearchW4 { 

	static void wordReplace(List<String> tenWords, int num1, int num2, int num3) {
		
	    // WRITE YOUR CODE HERE
		List<String> threeWords = new ArrayList<>();
		
		if (isValidIndex(num1) && isValidIndex(num2) && isValidIndex(num3)) {
            threeWords.add(tenWords.get(num1));
            threeWords.add(tenWords.get(num2));
            threeWords.add(tenWords.get(num3));
            System.out.println("Selected Words: " + threeWords);
        } else {
            System.out.println("Sorry, there was an error getting a number you requested.");
        }
    }
		static boolean isValidIndex(int index) {
			return index >= 0 && index <= 9;
		
		/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
		}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		
		List<String> tenWords = new ArrayList<String>();
		tenWords.add("Bumfuzzle");
		tenWords.add("Cattywampus");
		tenWords.add("Widdershins");
		tenWords.add("Gubbins");
		tenWords.add("Lollygag");
		tenWords.add("Malarkey");
		tenWords.add("Wabbit");
		tenWords.add("Impignorate");
		tenWords.add("Yarborough");
		tenWords.add("Bloviate");
		
		wordReplace(tenWords, num1, num2, num3);
		
	}
}