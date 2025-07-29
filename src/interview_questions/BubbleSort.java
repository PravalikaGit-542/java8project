package interview_questions;

public class BubbleSort {
	
	    public static void main(String[] args) {
	        int[] arr = {5, 2, 8, 1, 3};

	        // Bubble sort logic
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr.length-1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        // Print sorted array
	        System.out.print("Sorted array: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}

