/* ***************************************************
 * <April Gauthreaux>
 * <10/05/2023>
 * <List.java>
 *
 * <Functions to modify lists>
 *************************************************** */

// the EasyList class
public class List
{
	public static final int MAX_SIZE = 50;

	private int end;	// the index of the last valid item in the list
	private int curr;	// the index of the current item in the list
	private int[] list;	// the list

	// constructor
	// remember that an empty list has a "size" of 0 and its "position" is at -1
	public List()
	{
		curr = end = -1;
		list = new int[MAX_SIZE];
	}

	// copy constructor
	// clones the list l and sets the last element as the current
	public List(List l)
	{
		this.curr = this.end = -1;
		this.list = new int[MAX_SIZE];

		// copies the list one element at a time & last element is set to current
		for (int i = 0; i < l.GetSize(); i++)
			this.InsertAfter(l.list[i]);
	}

	// navigates to the beginning of the list
	public void First()
	{
		if (!IsEmpty())
			curr = 0;
	}

	// navigates to the end of the list
	// the end of the list is at the last valid item in the list
	public void Last()
	{
		curr = end;
	}

	// navigates to the specified element (0-index)
	// this should not be possible for an empty list
	// this should not be possible for invalid positions
	public void SetPos(int pos)
	{
		if (!IsEmpty())
		{
			if((pos <= end) && (pos >= 0))
				curr = pos;
		}
	}

	// navigates to the previous element
	// this should not be possible for an empty list
	// there should be no wrap-around
	public void Prev()
	{
		if (curr > 0)
			curr--;
	}

	// navigates to the next element
	// this should not be possible for an empty list
	// there should be no wrap-around
	public void Next()
	{
		if (curr < end)
			curr++;
	}

	// returns the location of the current element (or -1)
	public int GetPos()
	{
		return curr;	
	}

	// returns the value of the current element (or -1)
	public int GetValue()
	{
		if (curr < 0)
			return -1;
		else
			return list[curr];
	}

	// returns the size of the list
	// size does not imply capacity
	public int GetSize()
	{
		return (end+1);
	}

	// inserts an item before the current element
	// the new element becomes the current
	// this should not be possible for a full list
	public void InsertBefore(int data)
	{
		if (!IsFull())
		{
			if (IsEmpty())
				InsertAfter(data);
			else
			{
				if (curr == 0)
					curr = -1;
				Prev();
				InsertAfter(data);
			}
		}
	}

	// inserts an item after the current element
	// the new element becomes the current
	// this should not be possible for a full list
	public void InsertAfter(int data)
	{
		if (!IsFull())
		{
			if (curr == end)
			{
				list[curr+1] = data;
				curr++;
				end++;
			}
			else
			{
				for (int i = end; i > curr; i--)
					list[i+1] = list[i];
				list[curr+1] = data; 
				end++;
				curr++;
			}
		}	
	}

	// removes the current element (collapsing the list)
	// this should not be possible for an empty list
	public void Remove()
	{
		if (!IsEmpty())
		{
			if (curr == end)
			{
				curr--;
				end--;
			}
			else
			{
				for (int i = curr; i < end; i++)
					list[i] = list[i+1];
				end--;
			}
		}
	}

	// replaces the value of the current element with the specified value
	// this should not be possible for an empty list
	public void Replace(int data)
	{
		if (!IsEmpty())
			list[curr] = data;
	}

	// returns if the list is empty
	public boolean IsEmpty()
	{
		return (end == -1);
	}

	// returns if the list is full
	public boolean IsFull()
	{
		return (end+1 >= MAX_SIZE);
	}

	// returns if two lists are equal (by value)
	public boolean Equals(List l)
	{
		if (this.GetSize() != l.GetSize())
			return false;
		for (int i = 0; i < this.GetSize(); i++)
		{
			if (this.list[i] != l.list[i])
				return false;
		}
		return true;
	}

	// returns the concatenation of two lists
	// l should not be modified
	// l should be concatenated to the end of *this
	// the returned list should not exceed MAX_SIZE elements
	// the last element of the new list is the current
	public List Add(List l)
	{
		List result = new List(this);
		
		for (int i = 0; i < l.GetSize(); i++)
			result.InsertAfter(l.list[i]);
		return result;
	}

	// returns a string representation of the entire list (e.g., 1 2 3 4 5)
	// the string "NULL" should be returned for an empty list
	public String toString()
	{
		if (IsEmpty())
			return "NULL";
		String result = "";
		for (int i = 0; i <= end; i++)
			result += list[i] + " ";
		return result;
	}
}
