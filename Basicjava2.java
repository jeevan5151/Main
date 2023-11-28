package demo;
import java.util.Scanner;

public class Basicjava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number?");
		num1= sc.nextInt();
		System.out.println("Enter Second number?");
		num2= sc.nextInt();
	    
	    System.out.println("Arithemetic operation on the two numbers");
	    
	    System.out.println("Addition of two numbers is "+ (num1+num2));
	    System.out.println("Subtraction of two numbers is "+ (num1-num2));
	    System.out.println("Multiplication of two numbers is "+ (num1*num2));
	    System.out.println("Division of two numbers is "+ (num1/num2));
	    System.out.println("Modulo of two numbers is "+ (num1%num2));
	}
	
	}


