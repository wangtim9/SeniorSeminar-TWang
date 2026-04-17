import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SeniorSeminar {
	private ArrayList<Student> StudentList;
	private ArrayList<Sessions> SeminarList;
	//constructor for seniorseminar objects
	public SeniorSeminar(ArrayList<Student> StdList, ArrayList<Sessions> SemList) {
		StudentList = new ArrayList<Student>();
		SeminarList = new ArrayList<Sessions>();
		ArrayList[][] schedule = new ArrayList[5][5];
	}
	//getter for list of students
	public ArrayList<Student> getStudentList() {
		return StudentList;
	}
	//getter for list of sessions
	public ArrayList<Sessions> getSeminarList() {
		return SeminarList;
	}
	//fills arraylist of students with info from file with all the students and their choice
	public void makeStList(ArrayList<Student> studentlist) {
		//list of student objects
		//ArrayList<Student> StudentList = new ArrayList<Student>();
		File Students = new File("StudentObject.txt");
		try (Scanner Scan = new Scanner(Students)) {
			while (Scan.hasNextLine()) {
				String SData = Scan.nextLine();
				String[] Sdata = SData.split("	");
				Student Child = new Student(Sdata[0], Sdata[1], Sdata[2], Sdata[3], Sdata[4], Sdata[5]);
				studentlist.add(Child);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}
	}
	//fills arraylist of sessions with infromf rom file with all the session's id and speaker
		public void makeSeList(ArrayList<Sessions> sel) {
		//ArrayList<Sessions> SeminarList = new ArrayList<Sessions>();
		File Seminars = new File("seminars.txt");
		try (Scanner Scan = new Scanner(Seminars)) {
			while (Scan.hasNextLine()) {
				String data = Scan.nextLine();
				String[] IDs = data.split(",");
				Sessions Seminar = new Sessions(IDs[0], IDs[1]);
				sel.add(Seminar);
			}
			//System.out.println((SeminarList.get(0)).getName());
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}
	}
	//counter for popularity ranking
	//getting an error where at the end of running, all the variables equal to 0
	public void count(ArrayList<Student> StL, ArrayList<Sessions> SeL) {
		int one = 0;
	 int two = 0;
	 int three = 0;
	 int four = 0;
	 int five = 0;
	 int six = 0;
	 int seven = 0;
	 int eight = 0;
	 int nine = 0;
	 int ten = 0;
	 int eleven = 0;
	 int twelve = 0;
	 int thirteen = 0;
	 int fourteen = 0;
	 int fifteen = 0;
	 int sixteen = 0;
	 int seventeen = 0;
	 int eighteen = 0;
		ArrayList<Student> ALSt = StL;
		ArrayList<Sessions> ALSe = SeL;
		for (int i = 0; i < 17; i++) {
			for (int n = 0; n < 73; n++) {
				String[] choices = ((ALSt.get(n)).getChoices()).split(" "); 
				for (int b = 0; b < 4; b++) {
					if (((ALSe.get(i)).getID()).equals(choices[b])) {
						if (i == 0) {
							one++;
						}
						else if (i == 1) {
							two++;
						}
						else if (i == 2) {
							three++;
						}
						else if (i == 3) {
							four++;
						}
						else if (i == 4) {
							five++;
						}
						else if (i == 5) {
							six++;
						}
						else if (i == 6) {
							seven++;
						}
						else if (i == 7) {
							eight++;
						}
						else if (i == 8) {
							nine++;
						}
						else if (i == 9) {
							ten++;
						}
						else if (i == 10) {
							eleven++;
						}
						else if (i == 11) {
							twelve++;
						}
						else if (i == 12) {
							thirteen++;
						}
						else if (i == 13) {
							fourteen++;
						}
						else if (i == 14) {
							fifteen++;
						}
						else if (i == 15) {
							sixteen++;
						}
						else if (i == 16) {
							seventeen++;
						}
						else if (i == 17) {
							eighteen++;
						}
					}
				}
			}
		}
		System.out.println(two);
	}
	public void make
}


//Constructor for sessions
class Sessions {
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
}
			

//Constructor for student
class Student {
	
	private String SN;
	private String c1;
	private String c2;
	private String c3;
	private String c4;
	private String c5;
	private String[] schedule;
	//student object with thier name, and choices
	//choices used for counting the popularity of each seminar
	public Student(String Sname, String choice1, String choice2, String choice3, String choice4, String choice5, String[] schedule) {
		SN = Sname;
		c1 = choice1;
		c2 = choice2;
		c3 = choice3;
		c4 = choice4;
		c5 = choice5;
		Schedule = schedule;
	}
	//getters
	public String getChoices() {
		return c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5;
	}
	//public String getC2() {
	//	return c2;
	//}
	//public String getC3() {
	//	return c3;
	//}
	//public String getC4() {
	//	return c4;
	//}
	//public String getC5() {
	//	return c5;
	//}
	
	
	public String toString() {
		return (SN + " " + c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5);
	}			
}
