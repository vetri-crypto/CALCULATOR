package project;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		int choice;
		Float d;
		Float a;
		Float b;
		do {
			System.out.println("----------------CALCULATOR----------------------------------------");
			Scanner get=new Scanner(System.in);
			System.out.println("\n1.ADDTION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n");
		    choice=get.nextInt();
		    if(choice>4) {
		    	System.out.print("INVALID CHOICE\n");
		    	continue;
		    	}
		    System.out.println("Enter A number:");
		    a=get.nextFloat();
			System.out.println("Enter B number:");
			b=get.nextFloat();
			switch(choice) {
			case 1:
				d=a+b;
				System.out.println("ADDED VALUE:"+d);  
				System.out.println("------------------------------------------------------------------");
				break;
			case 2:
				d=a-b;
				System.out.println("SUBTRACT VALUE:"+d);
				System.out.println("------------------------------------------------------------------");
				break;
			case 3:	
				d=a*b;
				System.out.println("MULTIPLE VALUE:"+d); 
				System.out.println("------------------------------------------------------------------");
				break;
			case 4:
				d=a/b;
				System.out.println("DIVIDED VALUE:"+d); 
				System.out.println("------------------------------------------------------------------");
				break;
			}
		}while(true);    
	}		
}