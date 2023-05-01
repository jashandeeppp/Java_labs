package Lab05;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/* Write a program that calculates similarity of two articles. 
 * The algorithm is to create a set of unique words for each article and determine how many words the pair of articles shares in common. 
 * The program should read from two files: you can create your own txt files, and add some lines to use for this lab, 
 * OR you can use the attached files “NHL.txt”, “Java.txt” and create two corresponding sets. 
 * The pair of sets should be compared using the above formula.
 * When reading a line from a file, it is possible to use StringTockenizer to parse it using all the listed characters as delimiters:
 * StringTokenizer st = new StringTokenizer(line, " .'\"-,:;()[]{}`/*+");
 * while (st.hasMoreTokens()) {
 * String token = st.nextToken();
 * …
 * }
 * Provide a printout of each comparison.
*/

public class Lab05 {
	public static void main(String[] args) throws IOException {
		BufferedReader inputStream1 = null;
		BufferedReader inputStream2 = null;
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		try {
			inputStream1 = new BufferedReader(new FileReader("reader.txt"));
			inputStream2 = new BufferedReader(new FileReader("reader2.txt"));
			String l;
			while ((l = inputStream1.readLine()) != null) {
				System.out.println("Data from file1: "+l);
				set1 = setputtinSet(l);
			}
			l = "";
			while ((l = inputStream2.readLine()) != null) {
				System.out.println("Data from file2: "+l+"\n");
				set2 = setputtinSet(l);
			}
			
			System.out.print("Set 1: ");
			System.out.println(set1);
			System.out.print("Set 2: ");
			System.out.println(set2+"\n");

			// For Union
			double unionsize = union(set1, set2);
			//For Intersection
			double intersectionsize = intersection(set1, set2);
			
			double sim = intersectionsize/ unionsize;
			System.out.println("Similarity: "+sim);
		} finally {
			if (inputStream1 != null) {
				inputStream1.close();
			}
			if (inputStream2 != null) {
				inputStream2.close();
			}
		}
	}
	public static Set<String> setputtinSet(String l1){
		Set<String> set = new HashSet<String>();
		StringTokenizer st1 = new StringTokenizer(l1," .'\"-,:;()[]{}`/*+");
		while (st1.hasMoreTokens()) {
			set.add(st1.nextToken());
		}
		return set;
	}
	public static double union(Set<String> set1, Set<String> set2) {
		Set<String> union = new HashSet<String>(set1);
		union.addAll(set2);
		System.out.println("Union of sets: "+union);
		System.out.println("Size of union set: "+union.size()+"\n");
		return (double)union.size();
	}
	public static double intersection(Set<String> set1, Set<String> set2) {
		Set<String> intersection = new HashSet<String>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection of sets: "+intersection);
		System.out.println("Size of intersection sets: "+intersection.size()+"\n");
		return (double)intersection.size();
	}

}
