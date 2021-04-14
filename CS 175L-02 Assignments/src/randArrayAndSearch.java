import java.util.Arrays;
import java.util.Random;
public class randArrayAndSearch {

	public static void main(String[] args) {
		Random generator = new Random();
		int[] arr = new int[50];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length ; i++)
		{
			arr[i] = 1 + generator.nextInt(25);
			System.out.print(arr[i] + ", ");
			if (arr[i] < min)
			    min = arr[i];
			if (arr[i] > max)
			    max = arr[i];
		}     
		System.out.println("");
		System.out.println("The minimum value in the array is: " + min);
		System.out.println("The maximum value in the array is: " + max);
		System.out.println("The Product of the min and max is: " + (max * min));
		
		

	}

}
