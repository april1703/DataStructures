import java.io.*;

class Echo2
{
	public static void main(String [] args)
	{
		String searchkey = "eave"; // something to look for 
		
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String line;
			int lineNo = 0;
			
			while ((line = br.readLine()) != null)
			{
				boolean found = checkString(line.toLowerCase(), searchkey);
				if (found)
					System.out.println("Line #" + lineNo + ":\t" + line);
				
				lineNo++;
			}
			
			br.close();
		}
		catch (Exception e) {}
	}

	// a small function to check whether a substring exists in a longer string
	public static boolean checkString(String s, String k)
	{
		if (s.indexOf(k) >= 0)
			return true;
		return false;
	}
}