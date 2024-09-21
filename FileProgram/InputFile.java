package FileProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String maxLengthWord=" ";
		int count=0;
		File f=new File("Text1.txt");   //INPUT DATA IN THE FILE
		try (Scanner s = new Scanner(f)) {
			while(s.hasNextLine())
			{
				String data=s.nextLine() ;
				System.out.println(data);
				if(maxLengthWord.length()<data.length())
					maxLengthWord=data;
				++count;
					
			}
			System.out.println("Successfully input data form user");
		}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
		System.out.println("Maximum length word"+maxLengthWord);
		
	}

}
