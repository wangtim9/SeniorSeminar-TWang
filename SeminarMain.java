import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class SeminarMain {
	public static void main(String[] args) {
		SeniorSeminar hell = new SeniorSeminar();
		hell.makeStList(StudentList);
		hell.makeSeList(Seminarlist);
		hell.count(StudentList, SeminarList);
	}
}
