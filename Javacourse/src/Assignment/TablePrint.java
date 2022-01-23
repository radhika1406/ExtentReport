package Assignment;

import java.util.Scanner;

public class TablePrint {

	public void tableprint(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num +"X"+ i + "=" + num*i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TablePrint tp=new TablePrint();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for which you want to find table");
		int num=sc.nextInt();
		
		tp.tableprint(num);
	}

}
