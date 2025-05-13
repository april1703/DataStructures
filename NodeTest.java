class NodeTest
{
	public static void main(String [] args)
	{
		// The numbers to be put into the list	
		//int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 9, 8, 7};
		//Node head = buildforward(nums);		

		//Node head2 = buildbackward(nums);		

		//printList(head);
		//printList(head2);
		
		/*// create single node with value 5
		Node head = new Node();
		head.setData(5);

		// create and append a node with the value 10
		Node tail = new Node();
		tail.setData(10);
		head.setLink(tail);
		
		// for loop to add {15,20,25,30,35,40} to link list
		for (int i = 15; i < 45; i+=5)
		{
			tail.setLink(new Node());
			tail = tail.getLink();
			tail.setData(i);
		}

		// add a node with the value 12 in ascending order
		Node temp = head.getLink().getLink();
		head.getLink().setLink(new Node());
		head.getLink().getLink().setData(12);
		head.getLink().getLink().setLink(temp);
	
		// delete the node that contains value 5
		head = head.getLink();
		
		// while loop to square each element 
		Node curr = head;
		while (curr != null)
		{
			curr.setData(curr.getData() * curr.getData());
			curr = curr.getLink();
		}
		
		//head.getLink().getLink().setLink(new Node());
		//head.getLink().getLink().setData(12);	*/
		
		/*// set up for question 2a
		Node head = new Node();
		head.setData(3);
		Node p = new Node();
		p.setData(4);
		Node q = new Node();
		q.setData(8);
		Node tail = new Node();
		tail.setData(6);
		head.setLink(p);
		head.getLink().setLink(q);
		head.getLink().getLink().setLink(new Node());
		head.getLink().getLink().getLink().setData(5);
		head.getLink().getLink().getLink().setLink(tail);
		// deleting 8 (q node) from list
		head.getLink().setLink(q.getLink());*/
	
		// set up for question 2b
		Node head = new Node();
		head.setData(3);
		head.setLink(new Node());
		head.getLink().setData(4);
		Node p = new Node();
		p.setData(8);
		head.getLink().setLink(p);
		head.getLink().getLink().setLink(new Node());
		head.getLink().getLink().getLink().setData(5);
		Node tail = new Node();
		head.getLink().getLink().getLink().setLink(tail);
		head.getLink().getLink().getLink().getLink().setData(6);
		// deleting 6 (tail node) from list
		tail = null;
		head.getLink().getLink().getLink().setLink(tail);
		

		/*// set up for question 2c
		Node head = new Node();
		head.setData(3);
		head.setLink(new Node());
		head.getLink().setData(4);
		head.getLink().setLink(new Node());
		head.getLink().getLink().setData(8);
		head.getLink().getLink().setLink(new Node());
		head.getLink().getLink().getLink().setData(5);
		Node tail = new Node();
		tail.setData(6);
		head.getLink().getLink().getLink().setLink(tail);
		// add 2 before 3 (first node)
		Node p = new Node();
		p.setLink(head);
		head = p; 
		head.setData(2);*/

		/*// set up for question 2d
		Node head = new Node();
		head.setData(3);
		head.setLink(new Node());
		head.getLink().setData(4);
		head.getLink().setLink(new Node());
		head.getLink().getLink().setData(8);
		Node p = new Node();
		p.setData(5);
		Node tail = new Node();
		tail.setData(6);
		head.getLink().getLink().setLink(p);
		p.setLink(tail);
		// delete 5 (p node) from list
		head.getLink().getLink().setLink(tail);*/

		/*// set up for question 2e
		Node head = new Node();
		head.setData(3);
		head.setLink(new Node());
		head.getLink().setData(4);
		head.getLink().setLink(new Node());
		head.getLink().getLink().setData(5);
		Node p = new Node();
		p.setData(6);
		Node tail = new Node();
		tail.setData(7);
		head.getLink().getLink().setLink(p);
		p.setLink(tail);
		// add a node with 10 to end of the list
		tail.setLink(new Node());
		tail = tail.getLink();
		tail.setData(10);*/


		printList(head);
		printList(tail);
		printList(p);
		
	}

	public static Node buildforward(int [] nums)
	{
		Node head = null, tail = null, curr; 
		int num;

		for (int i = 0; i < nums.length; i++)
		{
			curr = new Node();
			curr.setData(nums[i]);
		
			if (head == null)
			{
				head = tail = curr;
			}
			else 
			{
				// make tail point to curr
				tail.setLink(curr);
				// then move tail over to the new last node 
				tail = tail.getLink();
			}
		}
		return head;
	}

	public static Node buildbackward(int [] nums)
	{
		int num; 
		Node head = null, curr;

		for (int i = 0; i < nums.length; i++)
		{
			// create the new node
			curr = new Node();
			curr.setData(nums[i]);

			// make the new node point to the head
			curr.setLink(head);

			// move head over(earlier) the new node
			head = curr;
		}
		
		return head; 
	}
	
	public static void printList(Node x)
	{
		Node curr = x; 
		
		while (curr != null)
		{
			System.out.print(curr);
			curr = curr.getLink();
		}
		System.out.println();
	}

	public static void squareList(Node x)
	{
		Node curr = x;
		while (curr != null)
		{
			curr.setData(curr.getData() * curr.getData());
			curr = curr.getLink();
		}
	}
}