
public class LinkedList {

	Node head;
	
	void addAtFirst(int d)
	{
		Node node=new Node();
		node.data=d;
		node.next=null;
		
		node.next=head;	
		head=node;	
	}
	void AddAtEnd(int d)
	{
		Node node=new Node();
		
		//Initialize the objects of the new node
		node.data=d;
		node.next=null;
		
		if(head==null)
		{
			node.data=d;
			node.next=null;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			
			n.next=node;
		}
	}
	void addAtIndex(int index,int d)
	{
		Node node=new Node();
		node.data=d;
		node.next=null;
		
		if(index==0)
		{
			addAtFirst(d);
		}
		else
		{
			Node n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			node.next=n.next;
			n.next=node;			
		}
	}

	void deleteAtIndex(int index)
	{
		Node n=head;
		
		if(index==0)
		{
			head=head.next;
		}
		else
		{
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		//variable 'n' holds the node just before the node to be deleted
		//variable 'temp' is the node to be deleted
		Node temp=null;
		temp=n.next;

		n.next=temp.next;
		System.out.println("Item deleted is: " + temp.data);	
		}
	}

	void display()
	{
		Node n=head;
		System.out.println("Displaying the LinkedList:");
		
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);		
	}

}
