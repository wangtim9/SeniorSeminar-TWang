import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Student {
	
	private String SN;
	private String c1;
	private String c2;
	private String c3;
	private String c4;
	private String c5;
	//student object with thier name, and choices
	//choices used for counting the popularity of each seminar
	public Student(String Sname, String choice1, String choice2, String choice3, String choice4, String choice5) {
		SN = Sname;
		c1 = choice1;
		c2 = choice2;
		c3 = choice3;
		c4 = choice4;
		c5 = choice5;
	}
	//getters
	public String getC1() {
		return c1;
	}
	public String getC2() {
		return c2;
	}
	public String getC3() {
		return c3;
	}
	public String getC4() {
		return c4;
	}
	public String getC5() {
		return c5;
	}
	public static void main(String[] args) {
		//list of student objects
		ArrayList<Student> StudentList = new ArrayList<Student>();
		File Students = new File("StudentObject.txt");
		try (Scanner Scan = new Scanner(Students)) {
			while (Scan.hasNextLine()) {
				String SData = Scan.nextLine();
				String[] Sdata = SData.split("	");
				Student Child = new Student(Sdata[0], Sdata[1], Sdata[2], Sdata[3], Sdata[4], Sdata[5]);
				StudentList.add(Child);
			}
			System.out.println(StudentList.size());
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}
	}
	//public String toString() {
		//return (SN + " " + c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5);
	//}
}			
