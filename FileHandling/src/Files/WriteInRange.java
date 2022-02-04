package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteInRange {

	public void filewrite(int rowstart, int rowend) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		File f=new File("../FileHandling/forwriting2.txt");
		FileWriter fw	=new FileWriter(f);	
		BufferedWriter bw=new BufferedWriter(fw);
		
		for(int j=0;j<rowstart;j++)
		{
			bw.write(" ");
			bw.newLine();
		}
		for(int i=rowstart;i<=rowend;i++)
		{
			System.out.println(i);
			System.out.println("Enter string to write in file");
			String str=sc.nextLine();
			bw.write(str);
			bw.newLine();
		}
		bw.close();
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WriteInRange fwr=new WriteInRange();
		int rowstart=4, rowend=7;
		fwr.filewrite(rowstart,rowend);

	}
}
