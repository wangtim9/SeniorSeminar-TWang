import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student {
	
	private String SN;
	private String c1;
	private String c2;
	private String c3;
	private String c4;
	private String c5;
	File Students = new File("StudentObjects.txt");
	try (Scanner Scan = new Scanner(Students)) {
			while (Scan.hasNextLine()) {
				String SData = Scan.nextLine();
				String[] Sdata = SData.split("	");
				Public Student = new Student(Sdata[0], Sdata[1], Sdata[3], Sdata[4], Sdata[5]);
			}
		Public Student(String Sname, String choice1, String choice2, String choice3, String choice4, String choice5) {
			SN = Sname;
			c1 = choice1;
			c2 = choice2;
			c3 = choice3;
			c4 = choice4;
			c5 = choice5;
		}
	}
}
				
