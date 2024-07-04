import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in))
		{
			Stack_Operation s=new Stack_Operation();
			boolean loop=true;
			while(loop)
			{
				int chioce;
				System.out.println("---Stack Operations----");
				System.out.println(" 1.Push \n 2.pop \n 3.Display \n 4.Exit");
				chioce=input.nextInt();
			
				switch(chioce) {
					case 1:
					{
						System.out.println("PUSH");
						s.push(input);
						break;
					}
					case 2:
					{
						System.out.println("POP");
						s.pop();
						break;
					}
					case 3:
					{
						System.out.println("Display..");
						s.display();
						break;
					}
					case 4:
					{
						System.out.println("Exit...");
						loop=false;
						break;
					}
					default:
					{
						System.out.println("Enter valid choice...");
						break;
					}
				}
			}
		}

	}

}
