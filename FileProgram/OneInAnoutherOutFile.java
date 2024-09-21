package FileProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OneInAnoutherOutFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("Text1.txt");
		File f1=new File("Text.txt");
		try {
			Scanner s = new Scanner(f);
			FileWriter obj=new FileWriter(f1);
			while(s.hasNextLine())
			{
				String data=s.nextLine() ;
				System.out.println(data);
			}
			System.out.println("Successfully input data form user");
			
			s.close();
			obj.close();
			
		}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
	}

}
