class Node
{
	private int data;
	private Node link;
	
	// constructor
	public Node()
	{
		data = -1;
		link = null;	
	} 

	// accessors and mutators
	public int getData()
	{
		return data;
	}
	
	public void setData(int data)
	{
		this.data = data; 	
	}

	public Node getLink()
	{
		return link;
	}

	public void setLink(Node link)
	{
		this.link = link;
	}
	
	// string representation
	public String toString()
	{
		return "" + data + "->";
	}
}