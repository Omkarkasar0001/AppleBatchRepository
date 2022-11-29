package inhritance.parentchild;
//E
import java.util.Scanner;

import Assignment_4_Method.Student1;

public class Student extends Faculty {
	String college;

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	void p11() {
		Student1 s = new Student1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls Enter Physics Marks");
		int s1 = sc.nextInt();
		System.out.println("Pls Enter Math Marks");
		int s2 = sc.nextInt();
		System.out.println("Pls Enter English Marks");
		int s3 = sc.nextInt();
		int m = (s1 + s2 + s3) / 3; // perce m
		if (m >= 0 && m <= 100) {
			if (m >= 80 && m <= 100)
				System.out.println("Your Passed With A+ Grade");
			else if (m >= 60 && m <= 79)
				System.out.println("Your Passed With A Grade");
			else if (m >= 50 && m <= 59)
				System.out.println("Your Passed With B Grade");
			else if (m >= 40 && m <= 49)
				System.out.println("Your Passed With C Grade");
			else
				System.out.println("Sorry pls give again exam");
		}
	}
}
