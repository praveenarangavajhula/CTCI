/*
2.1 Remove Dups: Write code to remove duplicates from an unsorted linked list.
*/

void RemoveDupls(LinkedListNode n)
{
	HashSet<Integer> set = new HashSet<Integer>();

	LinkedListNode prev=null;

	while(n!=null)
	{
		if(set.contains(n.data))
		{
			prev.next=n.next;

		}
		else
		{
			set.add(n.data);
			prev=n;
		}
		n=n.next;
	}
// Time - O(N)
// Space - O(N)


}

/*
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?
*/

void removedupe(LinkedListNode n)
{
	LinkedListNode current = n;
	while(current!=null)
	{
		LinkedListNode runner = current;

		while(runner.next!=null)
		{
			if(runner.next.data == current.data)
			{
				runner.next=runner.next.next;
			}
			else
			{
				runner=runner.next;
			}
		}
		current=current.next;
	}

	// Time - 1
	// Space - O(N^2)
}




