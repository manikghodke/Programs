package program;

import java.util.LinkedHashSet;

public class Arrays1 {

	public static void main(String[] args) {

		int arr[] = { 4, 3, 2, 1 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				int temp = 0;
				if (arr[i] > arr[j]) {

					// Swapping                //Acending order
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

			System.out.print(arr[i] + " ");
		}

//////////////////////////////////////////////////////////////////////////////////////////////		

		int temp = 0;
		int size;
		int array[] = { 221, 22, 44, 55, 65, 76, 87, 98, 123 };
		size = array.length;

		for (int i1 = 0; i1 < size; i1++) {
			for (int j1 = i1 + 1; j1 < size; j1++) {

				if (array[i1] > array[j1]) {
					temp = array[i1];
					array[i1] = array[j1];
					array[j1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Third second largest number is:: " + array[size - 3]);

		////////////////////////////////////////////////////////////////////////////////////////////
		  System.out.println();
		String str = "Balaji";
		// Create LinkedHashSet of type character
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		// Add each character of the string into LinkedHashSet
		for (int i2 = 0; i2 < str.length(); i2++) {
			set.add(str.charAt(i2));
		}                                                       //Remove Duplicate & Print== Balji

		System.out.print(set);
		// print the string after removing duplicate characters
		for (char ch : set) {
			System.out.print(ch);
		}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                System.out.println();
		int a[] = { 23, 1, 5, 78, 22, 4 };
                                                           //23+1+5+78+22+4/6==>22.16
		double total = 0;
		for (int i3 = a.length - 1; i3 >= 0; i3--) {
			total = total + a[i3];
		}
		double average = total / a.length;
		System.out.format("The average is: %.2f", average);

		// System.out.format("The average is: %.2f", average);

	}

}
