package logical;

public class Triangles {

	public static void main(String[] args) {

		int i;
		int j;
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//	///////////////////////////////////////////////////////////////////////////////

		int i1;
		int j1;
		for (i1 = 1; i1 <= 10; i1++) {
			for (j1 = i1; j1 <= 10; j1++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		/////////////////////////////////////////////////////////////////////////////////
		System.out.println();

		int i2, j2;
		int n = 5;
		// outer loop to handle number of rows
		for (i2 = 1; i2 <= n; i2++) {
			// inner loop to print space
			for (j2 = 1; j2 <= n - i2; j2++) {
				System.out.print(" ");
			}
			// inner loop to print star
			for (j2 = 1; j2 <= i2; j2++) {
				System.out.print(i2 + " ");
			}
			// print new line for each row
			System.out.println();
		}

	}

}
