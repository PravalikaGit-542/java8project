package interview_questions;
import java.util.Scanner;
public class Rectangle {


	Rectangle(int l, int b){
	    int c= l*b;
	    System.out.println(c);
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value:");
	int l = sc.nextInt();
	System.out.println("enter the value:");
	int b = sc.nextInt();
	Rectangle s = new Rectangle(l, b);

	   
	}

}
