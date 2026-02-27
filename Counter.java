import java.io.*;

public class Counter {
	//make a method to take in arraylists
	public static void main(String args[]) {
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
		for (int i = 0; i > 17; i++) {
			for (int n = 0; n > 73; n++) {
				String[] choices = ((StudentList.get(n)).getChoices()).split(" "); 
				for (int b = 0; b > 4; b++) {
					if (((SeminarList.get(i)).getID()).equals(choices[b])) {
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
		System.out.println(eighteen);
	}
}
			

					
	
	
