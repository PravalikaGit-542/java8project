package interview_questions.copy;

public class Remove_Duplicate {
	    public static void main(String[] args) {
	        String input = "madtamhuykii";
	        String output = "";

	        for (int i = 0; i < input.length(); i++) {
	            char current = input.charAt(i);
	            boolean isDuplicate = false;

	            // Check if current character already exists in output
	            for (int j = 0; j < output.length(); j++) {
	                if (output.charAt(j) == current) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            // If not a duplicate, add to output
	            if (!isDuplicate) {
	                output += current;
	            }
	        }

	        System.out.println("Output is: " + output);
	    }
	}