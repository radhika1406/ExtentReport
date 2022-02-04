package Files;

import java.io.*;
import java.util.Scanner;

public class FileWriteHandling {

	public void filewrite(int rowcount) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		File f=new File("../FileHandling/forwriting.txt");
		FileWriter fw	=new FileWriter(f);	
		BufferedWriter bw=new BufferedWriter(fw);
		while(rowcount>0)
		{
			System.out.println(rowcount);
			System.out.println("Enter string to write in file");
			String str=sc.nextLine();
			bw.write(str);
			bw.newLine();
			rowcount--;
		}
		bw.close();
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriteHandling fwr=new FileWriteHandling();
		int rowcount=4;
		fwr.filewrite(rowcount);

	}

}
