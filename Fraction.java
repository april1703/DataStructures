public class Fraction
{
	// instance variables
	private int num;
	private int den; 
	
	public Fraction()
	{
		setNum(0);
		setDen(1);
	}
	
	public Fraction(int num, int den)
	{
		setNum(num);
		setDen(den);
	}	
	
	// accessor for num
	public int getNum()
	{
		return num;
	}

	// mutator for num
	public void setNum(int num)
	{
		this.num = num;
	}

	// accessor for den
	public int getDen()
	{
		return den;
	}

	// mutator for den
	public void setDen(int x)
	{
		if (x != 0)
			this.den = x;
		else
			this.den = 1;
	}

	// A function to determine how a fraction will be printed
	public String toString()
	{
		return "" + this.num + "/" + this.den + " (" + getDecimal() + ")";
	}
	
	// A function to return the decimal equivalent of a fraction
	private double getDecimal()
	{
		return (double) this.num /this.den; 
	}
	
	public boolean equals(Fraction other)
	{
		return (this.getDecimal() == other.getDecimal());
	}
}