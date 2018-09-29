/*
2.2 Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
*/

LinkedListNode returnkth(LinkedListNode head,k)
{
	LinkedListNode p1=head;
	LinkedListNode p2=head;
	for(int i=0;i<k;i++)
	{
		if(p1==null) return null;
		p1=p1.next;
	}

	while(p1!=null)
	{
		p1=p1.next;
		p2=p2.next;		
	}

	return p2;

	// Time - O(N)  
	// Space - O(1)
}

// When p1 hits the null or the end of the linked list,p2 is at the kth node from the last