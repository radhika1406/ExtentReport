package Assignment;

import java.util.Scanner;

public class SwapTwoNumWithoutVar {

	public void swapwithoutvar(int a, int b)
	{
	
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap value of a is :" + a + "value of b is :" + b);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SwapTwoNumWithoutVar obj=new SwapTwoNumWithoutVar();
		System.out.println("Enter number 1");
		int num1= sc.nextInt();
		System.out.println("Enter number 2");
		int num2= sc.nextInt();
		
		System.out.println("value of a is :" + num1 + "value of b is :" + num2);
	}
}

/*
public void swapwithoutvar(int a, int b)
{
    c=a;
	a=b;
	b=c;
	System.out.println("After swap value of a is :" + a + "value of b is :" + b);
} */
