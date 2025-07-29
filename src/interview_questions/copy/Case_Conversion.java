package interview_questions.copy;

public class Case_Conversion {

	public static void main(String args[]) {
	String s = "pravalika to chase";
	System.out.println(s.toUpperCase());
	StringBuffer st=new  StringBuffer(s);
	st.append("FALSE");
	System.out.println(st);
String s2=	s + " FALSE";
	System.out.println(s2.toString().toLowerCase()); //Stringbuffer/Stringbuilder doesnt have a lower and upper case() method
	}
	
}
 