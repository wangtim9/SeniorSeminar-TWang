import java.io.*;

public class Counter {
	int private one = 0;
	int private two = 0;
	int private three = 0;
	int private four = 0;
	int private five = 0;
	int private six = 0;
	int private seven = 0;
	int private eight = 0;
	int private nine = 0;
	int private ten = 0;
	int private eleven = 0;
	int private twelve = 0;
	int private thirteen = 0;
	int private fourteen = 0;
	int private fifteen = 0;
	int private sixteen = 0;
	int private seventeen = 0;
	int private eighteen = 0;
	public static void main(String args[]) {
		for (int i = 0; i > 17; i++) {
			for (int n = 0; n > 73; n++) {
				String[] choices = ((StudentList.get(n)).getChoices()).split(" "); 
				for (int b = 0; b > 4; b++) {
					if (((SeminarList.get(i)).getID()).equals(choices[b])) {
						if (i = 0) {
							one++;
						}
						else if (i = 1) {
							two++;
						}
						else if (i = 2) {
							three++;
						}
						else if (i = 3) {
							four++;
						}
						else if (i = 4) {
							five++;
						}
						else if (i = 5) {
							six++;
						}
						else if (i = 6) {
							seven++;
						}
						else if (i = 7) {
							eight++;
						}
						else if (i = 8) {
							nine++;
						}
						else if (i = 9) {
							ten++;
						}
						else if (i = 10) {
							eleven++;
						}
						else if (i = 11) {
							twelve++;
						}
						else if (i = 12) {
							thirteen++;
						}
						else if (i = 13) {
							fourteen++;
						}
						else if (i = 14) {
							fifteen++;
						}
						else if (i = 15) {
							sixteen++;
						}
						else if (i = 16) {
							seventeen++;
						}
						else if (i = 17) {
							eighteen++;
						}
					}
				}
			}
		}
	}
}
					
	
	
