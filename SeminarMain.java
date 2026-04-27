import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class SeminarMain {
	public static void main(String[] args) {
		//construct arraylists before passing them into SeniorSeminar constructor
		ArrayList<Student> stuL = new ArrayList<Student>();
		ArrayList<Sessions> semL = new ArrayList<Sessions>();
		//2D arraylist to represent the overall schedule
		ArrayList<ArrayList<Sessions>> schedule = new ArrayList<ArrayList<Sessions>>();
		//adding rows
		schedule.add(new ArrayList<>());
		schedule.add(new ArrayList<>());
		schedule.add(new ArrayList<>());
		schedule.add(new ArrayList<>());
		schedule.add(new ArrayList<>());
		SeniorSeminar hell = new SeniorSeminar(stuL, semL);
		hell.makeStList(hell.getStudentList());
		hell.makeSeList(hell.getSeminarList());
		System.out.println(((hell.getSeminarList()).get(0)).getSpeaker());
		int[] numbers = new int[25];
		//test
		//System.out.println(hell.getStudentList());
		hell.count(numbers, hell.getStudentList(), hell.getSeminarList());
		ArrayList<Session2> Seminars_by_popularity = new ArrayList<Session2>();
		for (int a = 0; a < 18; a++) {
			Session2 Seminar2 = new Session2(((hell.getSeminarList()).get(a)).getID(), numbers[a]);
			Seminars_by_popularity.add(Seminar2);
		}
		hell.order(Seminars_by_popularity);
		System.out.println(Seminars_by_popularity.size());
		//System.out.println((Seminars_by_popularity.get(0)).getID2() + " " + (Seminars_by_popularity.get(0)).getPopularity());
		System.out.println(numbers[17]);
		hell.makeschedule(Seminars_by_popularity, hell.getSeminarList(), schedule);
		//for (int j = 0; j < Seminars_by_popularity.size() - 1; j++) {
		//	System.out.print((Seminars_by_popularity.get(j)).getID2() + " ");
		//}
		for (int i = 0; i < 5; i++) {
			for (int a = 0; a < 5; a++) {
				System.out.print("|" + ((schedule.get(i)).get(a)).getID() + "|");
			}
			System.out.println("");
		}
	}
}
