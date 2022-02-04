package Files;

import java.io.*;

public class CopyFile {
	
	public void FileCopy() throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("../FileHandling/sample.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("../FileHandling/copy.txt"));
		String a;
		while((a=br.readLine())!=null)
		{
			bw.write(a);
			bw.newLine();
		}
		br.close();
		bw.close();
		
	}

	public static void main(String[] args) throws IOException {
		
		CopyFile cp=new CopyFile();
		cp.FileCopy();
		System.out.println("Filecopied successfully!!");
		// TODO Auto-generated method stub

	}

}
