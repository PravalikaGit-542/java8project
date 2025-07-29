package interview_questions.copy;

import java.util.Scanner;

public class fabinocc {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num:");
			int n = sc.nextInt();
		     int n1=0;
		     int n2=1;
		     int temp = 0;
		     System.out.println(n1+ " "+n2);
		     for(int i=1; i<=n;i++) {
		  
		    	 temp = n1+n2;
		    	  System.out.println(temp);
		    	 n1=n2;
		    	 n2=temp;  
		     }}}