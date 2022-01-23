package Assignment;

import java.util.Scanner;

public class PrimeNumber {

	
	public int primenum(int num)
	{ int temp=0;
		for(int i=2;i<=num-1;i++)
		{ 
			//System.out.println("value of temp in loop start :"+ temp);
			
			if(num%i==0)
			{
				temp=temp+1;
				//System.out.println("value of temp in loop :"+ temp);
			}
			
		}
	//	System.out.println("value of temp :"+ temp);
		return temp;	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PrimeNumber pn=new PrimeNumber();
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		if((num==0)||(num==1))
		{
			System.out.println("number is not prime");
		}
	
		else
		{
		int result=pn.primenum(num);
		System.out.println("value of result :"+ result);
			
			if(result>0)
			{
				System.out.println("number is not prime");
				
			}
			else
			{
				System.out.println("number is prime");
			}
		}
	}

}
