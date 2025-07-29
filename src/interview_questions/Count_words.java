package interview_questions;
import java.util.Scanner;

public class Count_words {

		public static void main(String[] args) {
		
			// o/p- words counts = 2
			int count=1;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String:");
			String n = sc.nextLine();
			for(int i=0;i<n.length();i++) {
				if((n.charAt(i)==' ')&&(n.charAt(i+1)!=' ')) {
					count++;
				}
			}
				System.out.println(count);
			}}

