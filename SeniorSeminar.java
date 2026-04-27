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
		File Students = new File("StudentObject.txt");
		try (Scanner Scan = new Scanner(Students)) {
			while (Scan.hasNextLine()) {
				String SData = Scan.nextLine();
				String[] Sdata = SData.split("	");
				String[] child_schedule = new String[5];
				Student Child = new Student(Sdata[0], Sdata[1], Sdata[2], Sdata[3], Sdata[4], Sdata[5], child_schedule);
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
				Sessions Seminar = new Sessions(IDs[0], IDs[1], IDs[2]);
				sel.add(Seminar);
			}
			//System.out.println((SeminarList.get(0)).getName());
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}
	}
	//counter for popularity ranking
	public void count(int[] NUMS, ArrayList<Student> StL, ArrayList<Sessions> SeL) {
	 int[] Num = NUMS;
		ArrayList<Student> ALSt = StL;
		ArrayList<Sessions> ALSe = SeL;
		for (int i = 0; i < 18; i++) {
			for (int n = 0; n < 73; n++) {
				String[] choices = ((ALSt.get(n)).getChoices()).split(" "); 
				for (int b = 0; b < 4; b++) {
					if (((ALSe.get(i)).getID()).equals(choices[b])) {
						if (i == 0) {
							Num[0]++;
						}
						else if (i == 1) {
							Num[1]++;
						}
						else if (i == 2) {
							Num[2]++;
						}
						else if (i == 3) {
							Num[3]++;
						}
						else if (i == 4) {
							Num[4]++;
						}
						else if (i == 5) {
							Num[5]++;
						}
						else if (i == 6) {
							Num[6]++;
						}
						else if (i == 7) {
							Num[7]++;
						}
						else if (i == 8) {
							Num[8]++;
						}
						else if (i == 9) {
							Num[9]++;
						}
						else if (i == 10) {
							Num[10]++;
						}
						else if (i == 11) {
							Num[11]++;
						}
						else if (i == 12) {
							Num[12]++;
						}
						else if (i == 13) {
							Num[13]++;
						}
						else if (i == 14) {
							Num[14]++;
						}
						else if (i == 15) {
							Num[15]++;
						}
						else if (i == 16) {
							Num[16]++;
						}
						else if (i == 17) {
							Num[17]++;
						}
					}
				}
			}
		}
		/*
		System.out.println(Num[0]);
		int temp;
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 16; j++) {
				if (Num[j] < Num[j+1]) {
					temp = j;
					Num[j] = Num[j+1];
					Num[j+1] = Num[temp];
				}
			}
		}
		while (Num[24] == 0) {
			for (int i = 0; i < 7; i++) {
				Num[18+i] = Num[0+i];
			}
		}
		*/
	}
	public void order(ArrayList<Session2> Seminars2) {
		ArrayList<Session2> Se2= Seminars2;
		Session2 temp;
		for (int i = 0; i < 17; i++) {
			for (int j = 0; j < 17 - i; j++) {
				if ((Se2.get(j)).getPopularity() < (Se2.get(j+1)).getPopularity()) {
					temp = Se2.get(j);
					Se2.set(j, Se2.get(j+1));
					Se2.set(j+1, temp);
				}
			}
		}
		for (int d = 0; d < 7; d++) {
			Se2.add(Se2.get(d));
		}
	}
	
	public void makeschedule(ArrayList<Session2> Sem2, ArrayList<Sessions> SEL, ArrayList<ArrayList<Sessions>> Schedule) {
		ArrayList<Session2> SE2 = Sem2;
		ArrayList<Sessions> SE = SEL;
		ArrayList<ArrayList<Sessions>> The_Schedule = Schedule;
		int count2 = 0;
		int count3 = 0;
		Session2 temp2;
		for (int i = 0; i < 5; i++) {
			int prevSize = -1;
			count2 = 0;
			while (count2 < 5) {
				int currentSize = The_Schedule.get(i).size();
				if (currentSize == prevSize) break; // stops if no progress is made
				prevSize = currentSize;
				outer:
					for (int y = 0; y < SE.size(); y++){
						if (((SE2.get(0)).getID2()).equals((SE.get(y)).getID())) {
							if ((The_Schedule.get(i)).size() == 0) {
								(The_Schedule.get(i)).add(SE.get(y));
								System.out.println((SE2.get(0)).getID2());
								SE2.remove(0);
								count2++;
							}
							else {
								count3 = 0;
								for (int l = 0; l < (The_Schedule.get(i)).size(); l++) {
									if (((SE2.get(0)).getID2()).equals((The_Schedule.get(i).get(l)).getID())) {
										
									}
									else {
										count3++;
									}
								}
									if (count3 == (The_Schedule.get(i)).size()) {
										(The_Schedule.get(i)).add(SE.get(y));
										System.out.println((SE2.get(0)).getID2());
										SE2.remove(0);
										count2++;
									}
									if (count2 >= 5) {
										break outer;
									}
								}
							}
						}
					}
				}
			}
}


//Constructor for sessions
class Sessions {
	private String Seminar_name;
	private String SeminarID;
	private String Seminar_speaker;
	private int size;
	public Sessions(String name, String ID, String speaker) {
		Seminar_name = name;
		SeminarID = ID;
		Seminar_speaker = speaker;
	}
	//getters
	public String getName() {
		return Seminar_name;
	}
	public String getID() {
		return SeminarID;
	} 
	public String getSpeaker() {
		return Seminar_speaker;
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
	private String[] student_schedule;
	//student object with thier name, and choices
	//choices used for counting the popularity of each seminar
	public Student(String Sname, String choice1, String choice2, String choice3, String choice4, String choice5, String[] student_Schedule) {
		SN = Sname;
		c1 = choice1;
		c2 = choice2;
		c3 = choice3;
		c4 = choice4;
		c5 = choice5;
		student_schedule = student_Schedule;
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

class Session2 {
	private String SeminarID2;
	private int popularity;
	
	public Session2(String ID2, int people) {
		SeminarID2 = ID2;
		popularity = people;
	}
	
	public String getID2() {
		return SeminarID2;
	}
	public int getPopularity() {
		return popularity;
	}
}
