/* 
 * Armstrong numbers :0, 1,153,370,407,1634
 * logic : first find out length of the number or number of digits in the number
 * second reverse the number to get the remainder
 * the start a loop to find the cube
 */
package Assignment;
import java.util.Scanner;

public class ArmstrongCheck {

	public int lenCheck(int val)
	{
		int len=0;
		while(val!=0)
		{
			val=val/10;
			len=len+1;
		}
		System.out.println("length is :"+ len);
		return len;
	}
	
	public void armcheck(int num, int len)
	{
		int rem,armcal=0;
		int temp=num;
		while(temp!=0)
		{ 
			int multi=1;
			rem=temp%10;
			
			for(int i=1;i<=len;i++)
			{
				multi=multi*rem; //Finding the cube of a number
			}	
			armcal=armcal+multi;
			temp=temp/10;
		}
	if(num==armcal) 
	{
	 System.out.println("Number is armstrong");	
	}	
	else
	{
		System.out.println("Number is not armstrong");
	}	
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongCheck obj=new ArmstrongCheck();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int len= obj.lenCheck(num);
		obj.armcheck(num, len);
	}
}
