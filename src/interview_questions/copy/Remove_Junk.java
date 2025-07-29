package interview_questions.copy;

public class Remove_Junk {
		public static void main(String[] args) {
			
			String str = "635774635#%$^        *&$R%92107hdjfhdjbvjhdfgvsd          nvkasf[pwoer$&id=12";
		    /*String[] a= str.split("&");
			System.out.println(a[2]);
			int total=str.length();
			int s=str.replace("&", "").length();
			int t = total-s;
			System.out.println(t);*/
			
			
			/*System.out.println(str);
			String s=str.replaceAll("\\s", "");
			System.out.println(s);*/
			
			String s=str.replaceAll("\\s", "");
			String s1= s.replaceAll("[^0-9 a-z A-Z]", "");
			System.out.println(s1);
		}

	}


