import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
//constructor
public class Sessions {
	private String Seminar_name;
	private String SeminarID;
	public Sessions(String name, String ID) {
		Seminar_name = name;
		SeminarID = ID;
	}
	//getters
	public String getName() {
		return Seminar_name;
	}
	public String getID() {
		return SeminarID;
	} 
	//Here I use scannerr ot read in a file with the list of session names and ids
	public static void main (String[] args) {
		//initializaation of arraylist
		ArrayList<Sessions> SeminarList = new ArrayList<Sessions>();
		File Seminars = new File("seminars.txt");
		try (Scanner Scan = new Scanner(Seminars)) {
			while (Scan.hasNextLine()) {
				String data = Scan.nextLine();
				//split by commas
				String[] IDs = data.split(",");
				//object is created
				Sessions Seminar = new Sessions(IDs[0], IDs[1]);
				//object is added to arraylist
				SeminarList.add(Seminar);
			}
			//System.out.println((SeminarList.get(0)).getName());
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}
	}
}
			

