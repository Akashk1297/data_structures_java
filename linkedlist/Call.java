public class Call 
{
public static void main(String []args)
{
	
LinkedList obj=new LinkedList();

//Add an element at the start of linked list
obj.addAtFirst(10);

//Add an element at the end of linked list
obj.AddAtEnd(20);
obj.AddAtEnd(30);
obj.AddAtEnd(40);
//obj.addAtIndex(1,15);
//obj.addAtIndex(2,20);

//Add an element at a specific index of the linked list
obj.addAtIndex(3,35);

//Display the elements of linked list
obj.display();

//Display an element at a specific index of the linked list
obj.deleteAtIndex(1);

obj.display();
}

}
