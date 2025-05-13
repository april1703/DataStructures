class Hanoi
{
	private static int count = 0;
	public static void main(String [] args)
	{
		hanoi(343, 'A', 'C', 'B');
		System.out.println(count + " moves");
	}

	public static void hanoi(int n, char source, char dest, char layover)
	{
		if (n == 1)
		{
			singlemove(source, dest);
			return;
		}	
		else
		{
			hanoi(n-1, source, layover, dest);
			hanoi(1, source, dest, layover);
			hanoi(n-1, layover, dest, source);
		}
	}
	
	public static void singlemove(char source, char dest)
	{
		count++;
		System.out.println(source + "->" + dest);
	}
}