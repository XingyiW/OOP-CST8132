import java.util.Arrays;

public class ExerciseOne {

	private int[] myArray;

	public ExerciseOne(int d) {

		myArray = new int[10];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = i * d;
		}

	}

	public void printArrayStatement() {

		System.out.print(" int[] outputArray = {");
		for (int i = 0; i < myArray.length; i++) {
			if (i > 0 && i < myArray.length) {
				System.out.print(",");
			}
			System.out.print(myArray[i]);
		}
		System.out.print("};");
		System.out.println();
	}

	public void displayArrayTotal() {

		int sum = 0;
		for (int i : myArray) {
			sum += i;
		}

		// for (int i=0; i<myArray.length;i++) {
		// sum +=i;
		// }

		System.out.println(" The sum total of all elements of myArray is " + sum);
		System.out.println();
	}

	public static void main(String[] args) {

		ExerciseOne el = new ExerciseOne(2);
		el.printArrayStatement();
		el.displayArrayTotal();

	}

}
