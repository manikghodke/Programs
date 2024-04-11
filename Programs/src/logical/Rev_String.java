package logical;

public class Rev_String {

	public static void main(String[] args) {

		String s = "Java";
		int a = s.length();                              //avaJ
		for (int i = a - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println(a);
////////////////////////////////////////////////////////////////////////////////////		
		String[] k = "My country name is India".split(" ");
		StringBuilder revb = new StringBuilder();
		for (int j = k.length - 1; j >= 0; j--) {
			revb.append(k[j]);                  
			                               //India is name country My 
			revb.append(" ");                           //  <====
		}
		System.out.println(revb);

		System.out.println();
		////////////////////////////////////////////////////////////////////

		String j = "My name is Balaji";
		j = j.replace(" ", "");            //MynameisBalaji
		System.out.println(j);

///////////////////////////////////////////////////////////////////////////////////////////////////		

		System.out.println();
		// Get the String
		String str = "Balaji";

		// Get the index
		int index = 5;                 // In Balaji index 5 is i

		// Get the specific character
		char ch = getCharFromString(str, index);

		System.out.println("Character from " + str + " at index " + index + " is " + ch);

	}

	public static char getCharFromString(String str, int index) {
		return (char) str.codePointAt(index);
	}

}
