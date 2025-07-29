package interview_questions.copy;

public class Find_Duplicate {

		public static void main(String[] args) {
		
			String[] str= {"java", "python", "c", "c"};
			boolean flag = false;
			for(int i=0;i<str.length-1;i++) {
				for(int j=i+1;j<str.length;j++) {
					if(str[i]==str[j]) {
						System.out.println("found");
					flag=true;
				}}
			}
			
				if(!flag) {
					System.out.println("not found");
				}

		}}


