/*
This is just a test class
*/
class Grade
{
	public static void main (String [] args)
	{
		int x;  // this is a declaration
		x = 9;  // this is an initialization

		int y = 10;  // both declaration and initialization 
		
		int grade1 = 89, grade2 = 97, grade3 = 67;
		
		//int [] grades; // declaration

		//grades = new int [3]; // initialization
		
		// int [] grades = new int [3];
		int [] grades = {89, 97, 67};	
		
		printArray(grades);
		
		char result = getLetterGrade(grade1);

		System.out.println(grade1 + " is a/an " + result);
		
		// A statement that gets the average of the three
		// grades and prints them out 

		double avgNum = getAverage(grade1, grade2, grade3);	
		System.out.println("Average is " + avgNum);
		
	}
	
	// this function converts an integer to a letter grade
	public static char getLetterGrade(int x)
	{
		if (x >= 90)
			return 'A';
		else if (x >= 80)
			return 'B';
		else if (x >= 70)
			return 'C';
		else if (x >= 60)
			return 'D';
		else
			return 'F';
	}
	
	// A function to print an array of integers
	public static void printArray(int [] whatever)
	{ 
		int i = 0;
		while (i < whatever.length)
		{
			System.out.print(whatever[i] + ", ");
			i++;
		}
		System.out.println();
	}

	// A function that takes three integers and returns the average of those arguments
	public static double getAverage(int x, int y, int z)
	{
		return (x + y + z) / 3.0;
	}
}

			