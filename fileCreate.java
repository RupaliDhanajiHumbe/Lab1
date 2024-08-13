package FileProgram;

import java.io.File;
import java.io.IOException;
public class fileCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f=new File("Text.txt");    //create file in java project
		File f1=new File("F:\\JavaProgClassEclipse\\JavaProgram1\\Text1.txt");   //create file in specific place
		try {
			if(f.createNewFile()==true && f1.createNewFile()==true) {
			System.out.println("New create file "+f.getName());
			System.out.println("New create file "+f1.getName());
			}
			else {
				System.out.println("New file already created");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
