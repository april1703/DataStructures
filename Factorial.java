class Factorial
{
	public static void main(String [] args)
	{
		System.out.println("10! = " + r_fact(10));
		System.out.println("10! = " + i_fact(10));

		System.out.println(F(-1));
		//System.out.println(F(10));
	}
		
	public static int r_fact(int n)
	{
		if (n == 0)
			return 1;
		return n * r_fact(n-1);
	}
	
	public static int i_fact(int n)
	{
		int num = 1;
		if (n == 0)
			return 1;
		for (int i = 1; i <= n; i++)
			num *= i;
		return num;		
	}

	public static int F(int n)
	{
		if (n == 0)
			return 0;
		return n + F(n-1);
	}
}