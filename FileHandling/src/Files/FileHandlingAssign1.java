package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingAssign1 {

	public void ReadData(int row) throws IOException
	{
		
		File f=new File("../FileHandling/sample.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String a;
		int count=0;
		while((a= br.readLine())!=null)
				{
			      count++;
			      if(count==row)
			      {
			    	  System.out.println(a);
			    	  break;
			      }
				}
		}
		
public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row number which you want to Read : ");
		int row=sc.nextInt();
		FileHandlingAssign1 fh=new FileHandlingAssign1();
		fh.ReadData(row);
		
	}

}
/*

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class FileRead {
    public static void main( String args[] ) {
      int n = 1; // The line number
      try{
        String line = Files.readAllLines(Paths.get("file.txt")).get(n);
        System.out.println(line);
      } 
      catch(IOException e){
        System.out.println(e);
      }
    }
}
*/