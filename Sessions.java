import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sessions {
	public static void main (String[] args) {
		File Seminars = new File("seminars.txt");
		try (Scanner Scan = new Scanner(Seminars)) {
			while (Scan.hasNextLine()) {
				String data = Scan.nextLine();
				String[] IDs = data.split(",");
				String name = IDs[0];
				String number = IDs[1];
				System.out.println(name);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}
	}
}
			
