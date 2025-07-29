package interview_questions;

import java.util.Scanner;
public class Reverse_Number {

		public static void main(String[] args) {
		
		  Scanner s = new Scanner(System.in);
			System.out.println("Enter the num:");
			int  n = s.nextInt();
			int r=0;
			//for(int i=0;i<n;i++) {  when n is constant then only we can use for, but n is being changed inside the loop
			while(n!=0) {
				r=r*10+n%10;
				n=n/10;
			}
			System.out.println(r);
		}

	}

