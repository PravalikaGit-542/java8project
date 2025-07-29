package interview_questions.copy;
import java.util.Scanner;

public class count_character {
		public static void main(String[] args) {
			
			//o/p- pravalika, a-3
				String s= "pravalika";
				char ch='a';
				int n=s.length();
		//		int a=s.replace("r", "").length();
				int a=s.replace(String.valueOf(ch), "").length();
			    int t=n-a;
			    System.out.println(ch+ ":"+t);
			
			    /*Scanner sc = new Scanner(System.in);
			System.out.println("enter the string:");
			String n = sc.nextLine();
			System.out.println("enter the count of char:");
			char c = sc.next().charAt(0);
			int total=n.length();
			int char_count=n.replace(String.valueOf(c), "").length();
			int count= total-char_count;
	        System.out.println(count);*/
	}
}
