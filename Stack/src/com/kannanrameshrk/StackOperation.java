package com.kannanrameshrk;

public class StackOperation {
	int top;
	int size=10;
	int[] stack=new int[size];
	
	public StackOperation(int i) {
		top=i;
	}

	public void push(int n) {
		if(top==size-1) {
			System.out.println("Stack is overflow..");
		}else {
			top++;
			stack[top]=n;
		}
		
	}

	public void pop() {
		if(top==-1) {
			System.out.println("Stack is underflow....");
			return;
		}else {
			top--;
			System.out.println("Item is deleted..");
		}
		
	}

	public void display() {
		if(top==-1) {
			System.out.println("Not in element");
			return;
		}else {
			for(int i=0;i<=top;i++) {
				System.out.print(stack[i]+",");
			}
		}
		
	}

}
