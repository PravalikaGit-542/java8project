package interview_questions.copy;

public class String_Programs {

	    public static void main(String[] args) {
	        String str = "Hello";
	        str = str.concat(" World");  // Creates a new String
	        System.out.println(str);     // Output: Hello World
	    }
	}
	//str.concat(" World") does not modify str but returns a new String which is assigned back to str.

/*2. Using StringBuffer (Mutable)
	public class StringBufferExample {
	    public static void main(String[] args) {
	        StringBuffer sb = new StringBuffer("Hello");
	        sb.append(" World");  // Modifies the same object
	        System.out.println(sb);  // Output: Hello World
	    }
	}sb.append(" World") modifies the original StringBuffer without creating a new object.

	3. Using StringBuilder (Mutable but Faster)
	public class StringBuilderExample {
	    public static void main(String[] args) {
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");  // Modifies the same object
	        System.out.println(sb);  // Output: Hello World
	    }
	}StringBuilder is similar to StringBuffer but is not thread-safe, making it faster in single-threaded environments.

	4. Convert String to StringBuffer or StringBuilder
	String to StringBuffer:
	String str = "Hello";
	StringBuffer sb = new StringBuffer(str);
	sb.append(" World");
	System.out.println(sb);  // Output: Hello World
	String to StringBuilder:
	String str = "Hello";
	StringBuilder sb = new StringBuilder(str);
	sb.append(" World");
	System.out.println(sb);  // Output: Hello World

	5. Convert Back to String
	If you want to convert a StringBuffer or StringBuilder back to a String:
	Using toString():
	StringBuffer sb = new StringBuffer("Hello");
	String str = sb.toString();
	System.out.println(str);  // Output: Hello

	Summary:
	String – Immutable, creates a new object on modification.
	StringBuffer – Mutable, synchronized, and thread-safe.
	StringBuilder – Mutable, faster, but not thread-safe.
	
	-------String to array_-------
	public class Main {
    public static void main(String[] args) {
        String str = "Hello World Example";
        String[] arr = str.split(" "); // splits by space
        // Print each element of the array
        for (String word : arr) {
            System.out.println(word);
        }
    }
}
Or
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String str = "Hello World Example";
        String[] arr = str.split(" ");
        // Print array
        System.out.println(Arrays.toString(arr));
    }
}

------------string to char array--------
public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        char[] arr = str.toCharArray();
        // Print each character
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
    }
}

---Array to string---
import java.util.Arrays;
String[] arr = {"Hello", "World", "Example"};
System.out.println(Arrays.toString(arr));

----array to single string ---------
String[] arr = {"Hello", "World", "Example"};
String result = String.join(" ", arr);
System.out.println(result);

}*/
