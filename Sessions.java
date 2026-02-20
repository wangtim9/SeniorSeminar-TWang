import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Sessions {
	private String Seminar_name;
	private String SeminarID;
	public Sessions(String name, String ID) {
		Seminar_name = name;
		SeminarID = ID;
	}
	public String getName() {
		return Seminar_name;
	}
	public String getID() {
		return SeminarID;
	} 
	public static void main (String[] args) {
		ArrayList<Sessions> SeminarList = new ArrayList<Sessions>();
		File Seminars = new File("seminars.txt");
		try (Scanner Scan = new Scanner(Seminars)) {
			while (Scan.hasNextLine()) {
				String data = Scan.nextLine();
				String[] IDs = data.split(",");
				Sessions Seminar = new Sessions(IDs[0], IDs[1]);
				SeminarList.add(Seminar);
			}
			//System.out.println((SeminarList.get(0)).getName());
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}
	}
}
			
