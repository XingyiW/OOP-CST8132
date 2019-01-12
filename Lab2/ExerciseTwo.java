import java.util.Arrays;

public class ExerciseTwo extends ExerciseOne {

	private int[][] myArray1;

	public ExerciseTwo(int d) {
		super(d);
		myArray1 = new int[8][10];
		for (int i = 0; i < myArray1.length; i++) {
			for (int j = 0; j < myArray1[i].length; j++) {
				myArray1[i][j] = (i * myArray1[0].length + j) * d;
			}
		}

	}

	public void printArrayStatement(int i) {

		System.out.println("int[] [] outputArray = { ");
		for (int n = 0; n < myArray1.length; n++) {
			if (n >= 0 && n <= 8) {
				System.out.print("    {");
			}
			for (int m = 0; m < myArray1[n].length; m++) {
				if (m > 0 && m <= n * 10 + m) {
					System.out.print(",");
				}
				System.out.print(myArray1[n][m]);
			}
			System.out.println("}");
		}
		System.out.println("};");
	}

	public void displayTotal(int i) {
		int total = 0;

		// for (int[] k; k<myArray1.length;k++) {
		// for (int h; h<myArray1[k].length;h++) {
		// total += h;
		// }
		// }

		for (int[] k : myArray1) {
			for (int h : k) {
				total += h;
			}
		}
		System.out.println("The total sum of the elements in myArray1[][] is " + total);
	}

	public static void main(String[] args) {
		ExerciseTwo e2 = new ExerciseTwo(3);
		e2.printArrayStatement();
		e2.displayArrayTotal();
		e2.printArrayStatement(2);
		e2.displayTotal(2);

	}

}
