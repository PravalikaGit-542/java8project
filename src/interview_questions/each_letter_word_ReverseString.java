package interview_questions;
import java.util.Scanner;

public class each_letter_word_ReverseString {

		public static void main(String[] args) {
			
			//output = welcome to string_gnirts ot emoclew
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the striing:");
		String s = sc.nextLine();
		String r ="";
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
		}
			
		System.out.println( r);
		
		}

	}

