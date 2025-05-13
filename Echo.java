import java.util.*;

class Echo
{
	public static void myarraylistprint(ArrayList<Integer> x)
	{
		// use a for loop to print out all the elements
		for (int i : x) // This is what a for each loop looks like 
		{
			System.out.print(i + ", ");
		}
		
		System.out.println();
	}



	public static void main(String [] args)
	{
		int sum = 0;
		
		// Just to set up an arraylist
		ArrayList<Integer> numbers;
		numbers = new ArrayList<Integer>();
		
		//A scanner to read from input
		Scanner s = new Scanner(System.in);

		int temp;

		// while there is another integer in the scanner input, store
		// it, add it to the list, and then update the sum
		while (s.hasNextInt())
		{
			temp = s.nextInt();
			numbers.add(temp);
			sum += temp;	
		}
		System.out.println("The sum is " + sum);

		myarraylistprint(numbers);
	}

}