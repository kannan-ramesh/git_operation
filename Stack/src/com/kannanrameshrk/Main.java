package com.kannanrameshrk;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("\t\tStack Operation");
		System.out.println("\t\t****************");
		
		StackOperation stack=new StackOperation(-1);
		
		while(true) {
			System.out.println();
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. display");
			System.out.println("4. Exit");
			
			System.out.println("Enter Your Choice:");
			int choice=input.nextInt();
			
			switch(choice) {
			case 1:{
				System.out.println("Enter Number:");
				int n=input.nextInt();
				System.out.println("push value..");
				stack.push(n);
				break;
			}
			case 2:{
				System.out.println("pop operation");
				stack.pop();
				break;
			}
			case 3:{
				System.out.println("Stack element");
				stack.display();
				break;
			}
			case 4:{
				System.out.println("Exit......");
				System.exit(0);
				break;
			}
			default:{
				System.out.println("Invalid Choice...");
				break;
			}
			}
		}
	}

}
