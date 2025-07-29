package interview_questions;
import java.util.ArrayList;
import java.util.List;


public class Collection_Framework {
	    public static void main(String[] args) {
	        // First list
	        List<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");

	        // Second list
	        List<String> moreFruits = new ArrayList<>();
	        moreFruits.add("Mango");
	        moreFruits.add("Orange");

	        // Adding all elements from moreFruits to fruits
	        fruits.addAll(moreFruits);

	        // Printing the combined list
	        System.out.println("Combined Fruit List: " + fruits);
	    }
	}
	
	

