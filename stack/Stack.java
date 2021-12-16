import java.util.*;
import java.io.*;

public class Stack
{	 
	 int top,size,arr[];

	 Stack(int value)
	 {
		 top=-1;
		 size=value;
		 arr= new int[size];
	 }
	 
	 boolean isFull(int size)
	{
		if (top==size-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	 boolean isEmpty()
	{
		if (top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	 void push(int item)
	{				
		if(isFull(size) == true)
		{
			System.out.println("Stack is full.\nNo push operation permitted.");
		}
		else
		{
			arr[++top]=item;
		}
	}
	
	 void pop()
	{				
		if(isEmpty() == true)
		{
			System.out.println("Stack is empty.\nNo pop operation permitted.");
		}
		else
		{
			top--;			
		}		
	}
	
	 void display()
	{
		System.out.println("The Stack elements are:-");
		
		for (int i=0;i<=top;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
public static void main(String []args) throws IOException
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter size of stack?");
int size=sc.nextInt();

Stack obj=new Stack(size);

//Push elements into stack
for(int i=0;i<size;i++)
{
	System.out.println("Enter the element?");
	int val=sc.nextInt();
	obj.push(val);
}

//Display elements from stack
obj.display();

//Pop elements from stack
System.out.println("Enter 1 to Pop elements, Enter 0 to Exit?");
int j=sc.nextInt();
if(j==1)
	obj.pop();
else if(j==0)
	System.out.println("User does not want to run Pop operation. Exiting.");
else
	System.out.println("Wrong choice!");

//Display elements from stack
obj.display();

System.out.println("Stack Operation ends.");
}
}
