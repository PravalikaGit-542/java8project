package interview_questions.copy;

public class Digi_Sum {

	public static void main(String[] args) {
		
		int num=124365;
		int sum=0;
		while(num>0) {
			sum=sum+num%10;
			num/=10;
		}
		System.out.println(sum);

	}

}
