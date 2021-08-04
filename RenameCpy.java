/**
 * This class represents a file copiying and renaming 
 *
 * @author (Yoav Epstein)
 * @version (03/08/2021)
 */

import java.io.File;
import java.util.Scanner;
public class RenameCpy {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Scanner myReader;
		System.out.println("Enter the copied file directry")
		String cpyDirectry = scan.nextLine();  // Read user input
		File file = new File(cpyDirectry);

		System.out.println("Enter the names file directry")
		String nameDirectry = scan.nextLine();  // Read user input
		File names = new File(cpyDirectry);
		myReader = new Scanner(names)
		while (myReader.hasNextLine()){
			
		}

		while()
	}
}
