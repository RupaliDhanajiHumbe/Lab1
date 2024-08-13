package A;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class file1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "Text1.txt"; 
        File file = new File(fileName);

        try (Scanner s = new Scanner(file)) {
            while (s.hasNext()) {
                try {
                    int integer = s.nextInt();
                    System.out.println("Read integer: " + integer);
                } 
                catch (java.util.InputMismatchException e) {
                    System.out.println("Skipping non-integer value: " + s.next());
                    s.nextLine(); // clear invalid input
                }
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + fileName);
        }
    }
}