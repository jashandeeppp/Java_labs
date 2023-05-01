package Lab08;

/*
 * Your task is to write a Java program for this Selection sort algorithm. Submit the java code along with a screenshot of the output.
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] array = { 31, 3, 27, 10, 24, 15, 19 };
		int temp = 0;
		for (int i = 0; i < array.length-1; i++) {
			for (int k = i+1; k < array.length; k++) {
				int index = i;
				if (array[k] < array[i]) {
					index = k;
				}
				temp = array[index];
				array[index] = array[i];
				array[i] = temp;
			}
			System.out.println(array[i]);
		}
	}
}
