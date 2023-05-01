package Lab02;

import java.util.ArrayList;

/* Develop a Java application that demonstrates using Java interfaces. 
 * Create an interface (Student) with three abstract methods (addGrades, removeGrades and assignCourse). 
 * Create a class (GraduateStudent) that implements Student. 
 * Provide the implementation for the three methods as follows: addGrades takes grades and saves them in an array. 
 * The removeGrades removes grades from the array. The assignCourse assigns a course to a graduate student. 
 * Define another method (displayInfo) that prints out the grades and the course assigned to the student. 
 * Create another class (UnderGradStudent) that implements Student. Provide the same implementation for the three methods. 
 * In the main class, instantiate one object for each of the two classes, 
 * call the methods and pass all required data to display the appropriate outputs.
*/
public class Main {

	public static void main(String[] args) {
		GraduateStudent grad = new GraduateStudent();
		ArrayList<Integer> grades = new ArrayList<Integer>();
		grades.add(89);
		grades.add(96);	
		grades.add(78);	
		grades.add(93);	
		grades.add(91);
		grad.assignCourse("Java OOPs");
		grad.displayinfo(grades);
		grad.addGrades(grades);
		grad.removeGrades(grades);

		UnderGradStudent undergrad = new UnderGradStudent();
		ArrayList<Integer> grades2 = new ArrayList<Integer>();
		grades2.add(59);
		grades2.add(54);	
		grades2.add(78);	
		grades2.add(82);	
		grades2.add(49);
		grades2.add(65);
		undergrad.assignCourse("DataStructure and Algorithm");
		undergrad.displayinfo(grades2);
		undergrad.addGrades(grades2);
		undergrad.removeGrades(grades2);
	}

}
