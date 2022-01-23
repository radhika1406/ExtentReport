/* 
 * Program to check whether number is palindrome or not
 * palindrome means number and its reverse should be same
 * 121, 151, 1221, 1331,535
 * take num=121 lets say  we should follow the logic like divide num by 10, 
 * take the quotient in a variable and in loop use as the number, use remainder
 * 
 * */

package Assignment;

import java.util.Scanner;

public class PalindromeCheck {

	public void palincheck(int num)
	{
		int temp=num;
		int rem,rev=0;
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
	if(rev==num)
	{
		System.out.println("Number is palindrome");
	}
	else
	{
	System.out.println("Number is not palindrome");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeCheck obj=new PalindromeCheck();
		Scanner sc=new Scanner(System.in);
		PrimeNumber pn=new PrimeNumber();
		System.out.println("Enter a number");
		int num=sc.nextInt();
		obj.palincheck(num);
	}

}
