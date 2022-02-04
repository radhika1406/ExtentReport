package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileHandlingAssign2 {

	public void FileRangeReading(int rowstart, int rowend) throws IOException
	{
		File f= new File("../FileHandling/sample.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int count=0;
		String a;
		while((a=br.readLine())!=null)
		{
			count++;
			if(count>=rowstart && count<=rowend)
			{
				System.out.println(a);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		FileHandlingAssign2 fh=new FileHandlingAssign2();
		fh.FileRangeReading(2,4);
		
	}

}
