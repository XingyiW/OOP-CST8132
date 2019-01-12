package lab7_dup;

public class ArrayAccess implements ArrayAccessIf {

	int[] array = new int[10];

	@Override
	public void initArray(String[] s) {

		try {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					if (i != j) {

						if (Integer.parseInt(s[i]) == Integer.parseInt(s[j])) {
							System.out.println(i + ":" + s[i] + "," + j + ":" + s[j]);

							throw new DuplicateValueException();

						}

					}
					array[i] = Integer.parseInt(s[i]);
				}
			}
		}

		catch (

		NumberFormatException n) {
			System.err.println("Invalid number");
		} catch (DuplicateValueException e) {
			System.err.println("Duplicate number");
		}
		try {
			if (s.length > 10) {
				throw new ArrayIndexOutOfBoundsException();
			}
		} catch (ArrayIndexOutOfBoundsException a) {
			System.err.println("Array out of bounds");
		}

	}

	@Override
	public void findIndexFor(String s) {

		try {
			boolean checkindex = false;

			for (int i = 0; i < array.length; i++) {
				if (array[i] == Integer.parseInt(s)) {
					checkindex = true;
					System.out.println(array[i] + ", index: " + i);
				}
			}
			if (checkindex == false) {

				throw new NumberNotFoundException();
			}
		} catch (NumberFormatException n) {
			System.err.println("Invalid number");
		}

		catch (NumberNotFoundException e) {
			System.err.println("Number not found");

		}
	}

	@Override
	public void findValueFor(String s) {
		try {

			int i = Integer.parseInt(s);
			if (i >= 0 && i < array.length) {
				System.out.println("index" + s + ":" + array[i]);
			} else {
				throw new ArrayIndexOutOfBoundsException();
			}

		} catch (NumberFormatException n) {
			System.err.println("Invalid number");
		} catch (ArrayIndexOutOfBoundsException c) {
			System.err.println("Array out of bounds");
		}

	}

}
