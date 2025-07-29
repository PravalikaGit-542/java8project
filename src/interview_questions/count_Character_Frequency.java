package interview_questions;
import java.util.*;
public class count_Character_Frequency {
    public static void main(String[] args) {
      
    	  /*      String str = "pravalika";
    	        for (int i = 0; i < str.length(); i++) {
    	            char ch = str.charAt(i);
    	            if (str.indexOf(ch) == i) { // only count if it's the first time
    	                int count = 0;
    	                for (int j = 0; j < str.length(); j++) {
    	                    if (str.charAt(j) == ch) {
    	                        count++;
    	                    }
    	                }
    	                System.out.println(ch + " = " + count);
    	            }
    	        }
    	    }
    	}
*/
    	
     	
 //    -----------------------using scanner-------------------------------------------------

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine().toLowerCase(); // convert to lowercase for easy matching

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == i) { // first occurrence only
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }
                System.out.println(ch + " = " + count);
            }
        }

        sc.close();
    }
}
/*
---------------------------------------------------------------------------------------------------------------------
     	 String input = "Boardbridge";
        input = input.toLowerCase(); // optional: for case insensitive

        System.out.println("Repeated characters are:");

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int count = 0;

            // Check if this character already appeared before
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (input.charAt(k) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue; // skip already counted character
            }

            // Count how many times this character appears
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(ch + " : " + count);
            }
        }*/
