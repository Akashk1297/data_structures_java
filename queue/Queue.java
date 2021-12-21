import java.io.*;
import java.util.*;
public class Queue {

	int front,rear, arr[],size;
	Queue(int n)
	{
		front=-1;
		rear=-1;
		size=n;
		arr=new int[size];
	}
	void isFull()
	{
		if(front==0 && rear==size-1)
		{
			System.out.println("Queue is full.");
			System.exit(1);
		}
	}
	void isEmpty()
	{
		if(front==-1)
		{
			System.out.println("Queue is empty.");
			System.exit(1);
		}
	}
	void Add(int data)
	{
		if(front==0 && rear==size-1)
		{
			System.out.println("Queue is full.");
			System.exit(1);
		}
		else if(front==-1)
		{
			front=0;	
		}
		arr[++rear]=data;
		System.out.println("Added element is:"+ arr[rear]);	
	}
	void Remove()
	{
		if(front==-1)
		{
			System.out.println("Queue is empty.");
			System.exit(1);
		}
		else
		{
			System.out.println("Removed element is:"+ arr[front++]);
		}		
	}
	void display()
	{
		System.out.println("Displaying the Queue elements.");
		for(int i=front;i<=rear;i++)
		{
			System.out.println(arr[i]);
		}		
	}
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of queue:");
		int n=sc.nextInt();
		
		Queue obj=new Queue(n);
		
		obj.Add(55);
		obj.Add(56);
		obj.Add(57);
		
		obj.display();
		
		obj.Remove();

		obj.display();

	}

}
