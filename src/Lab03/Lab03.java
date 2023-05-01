package Lab03;

import java.util.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/* Develop a Java application that demonstrates using Java File I/O. 
 * Use FileReader and FileWriter classes to read one line from a file and write it to another file. 
 * Then read the line again from the second file as characters and save them in an array. 
 * Then process the characters in the array to remove the repeated ones 
 * so one occurrence of each character exists in the array (e.g. [“hello”, “hi”, “hi”, “good”] >>> [ [“hello”, “hi”, “good”]). 
 */
public class Lab03 {

	public static void main(String[] args) throws IOException {
		FileReader inputStream = null;
		FileWriter outputStream = null;
		BufferedReader inputStream2 = null;
		try {
			inputStream = new FileReader("reader.txt");
			outputStream = new FileWriter("output.txt");
			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}

		try {
			inputStream2 = new BufferedReader(new FileReader("output.txt"));
			String str;
			String content = "";
			while ((str = inputStream2.readLine()) != null) {
				content = str;
				System.out.println("Array before removing duplicated elements: " + str);
			}
			int j = 0;
			String[] data = content.split(" ");
			String[] finaldata = new String[content.length()];
			
			for (int i = 0; i < data.length-1; i++) {//8  0-7
				System.out.println(i);
				if (!(data[i].equals(data[i + 1]))) {
					finaldata[j++] = data[i];
				}
			}
			
			finaldata[j++] = data[data.length - 1];
			System.out.println("Array after removing duplicated elements: ");
			for (int k = 0; k < j; k++) {
				System.out.print(finaldata[k] + " ");
			}
		} finally {
			if (inputStream2 != null) {
				inputStream2.close();
			}
		}
	}
}
