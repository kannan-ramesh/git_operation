import java.util.Scanner;

public class Stack_Operation {
	int top;
	int size=10;
	int arr[]=new int[size];
	
	Stack_Operation() {
		top=-1;
	}
	
	boolean isEmpty() {
		
		return (top<0);
		
	}

	public void push(Scanner input) {
		
		if(top==size-1) {
			System.out.println("Stack over flow");
		}else {
			System.out.println("Enter number:");
			int val=input.nextInt();
			top++;
			arr[top]=val;
			System.out.println("value pushed");
		}
	}

	public void pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}else {
			top--;
			System.out.println("item deleted");
		}
		
	}

	public void display() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}else
		{
		System.out.println("printing Stack elements..");
		
		for(int i=0;i<=top;i++) {
			System.out.println(arr[i]);
		}
		}
		
	}

}
