package interview_questions.copy;

import java.util.Scanner;
public class Palindrome {

		public static void main(String[] args) {
			String rev="";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			String num = sc.nextLine();
		    int l =	num.length();
		    for(int i=l-1;i>=0;i--) {
		     rev= rev+num.charAt(i);
		    }
		    if(rev.equals(num)) {
		    	System.out.println("palindrome");
		    }
		    else {
		    	System.out.println("not palindrome");
		    }

}
}