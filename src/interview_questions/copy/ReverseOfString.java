package interview_questions.copy;

import java.util.Scanner;

public class ReverseOfString {
		public static void main(String[] args) {
			/*Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string:");
			String s = sc.nextLine();
			StringBuffer a = new StringBuffer(s);
			System.out.println(a.reverse());*/
			
			 String input = "My name is pravalika";
		        String reversed = new StringBuilder(input).reverse().toString();
		        System.out.println(reversed);  

		/*	-------reverse the string at same place------
			/*        String str = "My name is pravalika";
			        String[] s = str.split(" ");
			        String rev = "";

			        for (String a : s) {
			            String reverse = "";
			            for (int i = a.length() - 1; i >= 0; i--) {
			                reverse = reverse + a.charAt(i);
			            }
			            rev = rev + reverse + " ";
			        }

			        System.out.println(rev.trim());*/
		
			
		}}

