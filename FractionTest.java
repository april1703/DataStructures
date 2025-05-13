import java.util.*;

class FractionTest
{
	public static void main(String [] args)
	{
		Random r = new Random();
		
		Fraction [] fractions = new Fraction[10];
		
		for (int i = 0; i < fractions.length; i++)
		{
			int x = r.nextInt(1000);
			int y = r.nextInt(1000);
			fractions[i] = new Fraction(x, y);
		}
		
		printFunction(fractions);
	
		// create an object
		int x = 6;
		Fraction f1 = new Fraction(); 	// declare and initialize a fraction
		
		Fraction f2 = new Fraction(3, 5);
	
		Fraction f3, f4, f5;
		f3 = new Fraction(5, 0);
		f4 = f3; 
		f5 = f4;

		f5.setNum(7);
		f3.setDen(2);

		Fraction f6 = new Fraction(x, 100);
		f6.setNum(7);
		f6.setDen(0);
	
		//changing the value of an object AFTER it was initialized. 
		f3 = new Fraction(14, 200);

		int y, z;
		y = x;
		z = y;

		z = 10;
		y = 17;

		// Print out the variables above
		System.out.println("f1 is " + f1);
		System.out.println("f2 is " + f2);
		System.out.println("f3 is " + f3);
		System.out.println("f4 is " + f4);
		System.out.println("f5 is " + f5);

		System.out.println("x is " + x);
		System.out.println("y is " + y);
		System.out.println("z is " + z);
		
		if (f6.equals(f3))
			System.out.println(f6 + " and " + f3 +  " are the same");
		else
			System.out.println(f6 + " and " + f3 + " are different");
	}

	public static void printFunction(Fraction [] x)
	{
		for (int i = 0; i < x.length; i++)
			System.out.println(i + ":\t" + x[i]);
	}	
}