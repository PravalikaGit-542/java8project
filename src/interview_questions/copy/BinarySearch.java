package interview_questions.copy;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		     /*   int[] a = {10, 20, 30, 40, 50};
		        int key =60;
		        int l = 0;
		        int h = a.length - 1;
		        boolean flag = false;*/
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sorted array elements");
		int n = sc.nextInt();
		System.out.println("enter the elements");
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the key to search");
		int key=sc.nextInt();
		 int l = 0;
	        int h = a.length - 1;
	        boolean flag = false;
		        while (l <= h) {
		            int m = (l + h) / 2;
		            if (a[m] == key) {
		                System.out.println("found at index " + m);
		                flag = true;
		                break;
		            } else if (a[m] < key) {
		                l = m + 1;
		            } else {
		                h = m - 1;
		            }
		        }
		        if (!flag) {
		            System.out.println("not found");
		        }
		    }
		}

/*---------------------
 int s=Arrays.binarySearch(a,50);
System.out.println(s);

-------------------------------------
import java.util.Arrays;
import java.util.Scanner;

public class SmallBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 4, 6, 8, 10}; // Already sorted
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        int index = Arrays.binarySearch(arr, key);

        if (index >= 0)
            System.out.println("Found at index: " + index);
        else
            System.out.println("Not found.");

        sc.close();
    }
}
*/