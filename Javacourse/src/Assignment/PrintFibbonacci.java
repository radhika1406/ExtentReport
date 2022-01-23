package Assignment;

import java.util.Scanner;

public class PrintFibbonacci {

	static int a=0,b=1,c;
	/* with recursion */
	public void printfib(int terms)
	{
		if(terms>1)
		{
			c=a+b;
			System.out.println("" + c);
			a=b;
			b=c;
			printfib(terms-1);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintFibbonacci pb=new PrintFibbonacci();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many terms of fibonnaci series you want to print");
		int count=sc.nextInt();
		System.out.println("" + a);
		System.out.println("" + b);
		pb.printfib(count);
	}

}

/* 
public void printfib(int terms)
{
	int a=0,b=1,c;
	
	for(int i=0;i<terms;i++)
	{
		c=a+b;
		System.out.println("" + c);
		a=b;
		b=c;
	}
	
	
}
*/