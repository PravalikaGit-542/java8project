package interview_questions.copy;
import java.util.Scanner;
public class Vowels_Constant_count {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        int vowels = 0;
	        int consonants = 0;

	        str = str.toUpperCase(); // Convert to uppercase

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Check if it's a letter
	            if (ch >= 'A' && ch <= 'Z') {
	                // Check if it's a vowel
	                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }

	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	    }
	}
	
/*
 public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "hello world";
        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase(); // Convert the whole string to lowercase

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get each character

            // Check if it's a letter
            if ((ch >= 'a' && ch <= 'z')) {
                // Check if it's a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
 */
	
	
	
