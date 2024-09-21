package FileProgram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputInFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f1=new File("Text.txt");
		String[] color= {"Red","Yellow","Blue"};
		
		try {
			FileWriter  obj=new FileWriter(f1);
			for(int i=0;i<color.length;i++) {
				obj.write(color[i]);
			}
			obj.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
