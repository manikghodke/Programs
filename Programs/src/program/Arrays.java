package program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Arrays {

	public static void main(String[] args) {

		int a[] = new int[4];
		a[0] = 3;
		a[1] = 10;                           //<================
		a[2] = 11;
		a[3] = 2;

		for (int j = a.length - 1; j >= 0; j--) {
			System.out.print(" " + a[j] + " ");
		}
		System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("balaji");
		list1.add("biradar");
		list1.add("latur");                       //Common Element:[balaji, biradar]

		System.out.println("List1:" + list1);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("balaji");
		list2.add("biradar");
		list2.add("udgir");

		System.out.println("List2:" + list2);

		list1.retainAll(list2);
		System.out.println();
		System.out.println("Common Element:" + list1);

		/////////////////////////////////////////////////////////////////////////////////
		System.out.println();

		String name = "Automation Testing";
		Set<Character> uniqchae = new HashSet<>();
		char arr[] = name.toCharArray();         
	                           
		for (char c : arr) {         //Automation Testing:[ , A, a, e, g, i, m, n, o, s, t, T, u]
			uniqchae.add(c);
		}
		System.out.print(name + ":" + uniqchae);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println();

		String name1 = "Pooja";                             //The string is :Pooja                                                 //The duplicate character of above String is:o 
		char arra[] = name1.toCharArray();                 //Duplicate is : o
		System.out.println("The string is :" + name1);
		System.out.print("The duplicate character of above String is:");
		for (int i1 = 1; i1 < name1.length(); i1++) {
			for (int j1 = i1 + 1; j1 < name1.length(); j1++) {
				if (arra[i1] == arra[j1]) {
					System.out.print(arra[j1] + " ");
					break;
				}
			}
		}

		/////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println();

		String name2 = "Balaji";
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		char strarry[] = name2.toCharArray();
		for (char c : strarry) {
			if (charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c) + 1);
			} else {
				charmap.put(c, 1);                    //{a=2, B=1, i=1, j=1, l=1}
			}

		}
		System.out.println(name + ":" + charmap);

	}
}
