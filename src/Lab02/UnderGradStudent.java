package Lab02;

import java.util.ArrayList;

public class UnderGradStudent implements Student {
	private ArrayList<Integer> grade = new ArrayList<Integer>();
	private String course;

	public void addGrades(ArrayList<Integer> grades) {
		this.grade = grades;
		this.grade.add(94);
		System.out.print("Adding Grades: ");
		for (int i : grade) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public void removeGrades(ArrayList<Integer> grades) {
		grade.remove(5);
		System.out.print("Remove Grades: ");
		for (int i : grade) {
			System.out.print(i+" ");
		}
	}

	public void assignCourse(String course) {
		this.course = course;
	}

	public void displayinfo(ArrayList<Integer> grades) {
		System.out.println("\n");
		System.out.println("### UnderGraduate Student ###");
		System.out.println("Course: " + course);
		System.out.print("Grades: ");
		for (int i : grades) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
