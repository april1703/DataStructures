import java.util.*;

class Play
{
	public static void main(String [] args)
	{
		// create a list
		int [] thelist = createList(20);
		
		// print the list
		printList(thelist);
		
		// ask the user for a key
		int key = getKey();
		
		// search through the list linear/sequential
		int loc = findKey(thelist, key);
		System.out.println("Key was found at " + loc);

		// sort the list
		bubbleSort(thelist);
	
		// print the list
		printList(thelist);

		// search using binary search
		loc = binarySearch(thelist, key);
		System.out.println("Key was found using bin search at " + loc);
	}

	// this is binary search 
	public static int binarySearch(int [] array, int key)
	{
		int first = 0; 
		int last = array.length-1; 
		int mid;
		
		while(first <= last)
		{
			mid = (first + last) /2;
			if (array[mid] == key)
				return mid;
			else if (array[mid] < key)
				first = mid + 1;
			else
				last = mid - 1;
		}
		return -1;	
	}

	// this is bubble sort
	public static void bubbleSort(int [] array)
	{
		for (int i = 1; i < array.length; i++)
		{
			// inner for loop drives the comparisons and swaps
			for (int j = 1; j < array.length; j++)
			{
				// if two consecutive elements are out of order, then swap them
				if (array[j] < array[j-1])
				{
					int temp = array[j]; 
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}

	// linear/sequential search algorithm
	public static int findKey(int [] list, int key)
	{
		for (int i = 0; i < list.length; i++)
		{
			if (list[i] == key)
				return i;
		}
		return -1;
	}

	public static int getKey()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What key are you looking for? ");
		int res = sc.nextInt();
		return res;
	}
	
	public static int[] createList(int size)
	{
		Random r = new Random();
		int [] list = new int [size];
		
		for(int i = 0; i < list.length; i++)
			list[i] = r.nextInt(1000);
		return list;
	}
	
	public static void printList(int [] list)
	{
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + ", ");
		System.out.println();
	}
	
}