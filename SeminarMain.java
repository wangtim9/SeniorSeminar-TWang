import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class SeminarMain {
	public static void main(String[] args) {
		//construct arraylists before passing them into SeniorSeminar constructor
		ArrayList<Student> stuL = new ArrayList<Student>();
		ArrayList<Sessions> semL = new ArrayList<Sessions>();
		SeniorSeminar hell = new SeniorSeminar(stuL, semL);
		hell.makeStList(hell.getStudentList());
		hell.makeSeList(hell.getSeminarList());
		//test
		System.out.println(hell.getStudentList());
		hell.count(hell.getStudentList(), hell.getSeminarList());
	}
}
