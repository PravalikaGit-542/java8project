package interview_questions.copy;

public class MaxMinArray {

	public static void main(String[] args) {
		
		int[] arr= {3,4,9,8,7};
		int max=arr[0], min=arr[0];
			
		for(int num:arr) {
			if(num>max ) {
				max=num;
		}
		if(num<min) {
			min=num;
			
		}
	}
		System.out.println(max+","+min);
		}
}
