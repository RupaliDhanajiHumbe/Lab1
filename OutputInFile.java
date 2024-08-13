package FileProgram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f1=new File("Text1.txt");
		
		try {
			FileWriter  obj=new FileWriter(f1);
			obj.write("Java is fun language");
			obj.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
