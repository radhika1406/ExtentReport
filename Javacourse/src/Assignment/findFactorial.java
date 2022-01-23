package Assignment;

import java.util.Scanner;

public class findFactorial {
	int fact=1;
	public int factorial(int num)
	{
		//System.out.println("entered in while, num is: " + num);
		  if(num>0)
		  {
			fact=fact*num;
			//System.out.println("value of fact is" + fact);
			factorial(num-1);
		  }
		
		  return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findFactorial fact=new findFactorial();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for which you want to find factorial");
		int num=sc.nextInt();
		int result=fact.factorial(num);
		System.out.println("Factorial of" + num + "is:" + result);
		
	}

}


/*

public int factorial(int num)
{
	
	for(int i=num;i>=1;i--) 
	{
		fact=fact*i;
	}
	return fact;
}
*/