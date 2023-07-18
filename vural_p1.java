class vural_p1 {

	// constructor for the class
	public vural_p1() {
	}

	// 1.
	/*
	 * method to sort an array of String values using selection sort
	 * sorting the array element starting at lowerBound and ending at upperBound
	 */
	public String[] selectionSort(String[] values, int lowerBound, int upperBound) {
		// TODO: - implement
		for (int i = lowerBound; i <= upperBound; i++) {
			int min_index = i;
			for (int j = i + 1; j <= upperBound; j++) {
				if (values[min_index].compareTo(values[j]) > 0) {
					min_index = j;
				}
			}
			if (min_index != i) {
				String temp_string = values[min_index];
				values[min_index] = values[i];
				values[i] = temp_string;
			}
		}
		return values;
	}

	// 2.;
	/*
	 * method to return the number of array elements <= testValue with indices in
	 * [lowerBound, upperBond] using a for loop to examine the array elements
	 */
	public int forLoopTest(int lowerBound, int upperBound, int testValue, int[] values) {
		// TODO: - implement
		int a_counter = 0;
		for (int i = lowerBound; i <= upperBound; i++) {
			if (values[i] <= testValue) {
				a_counter++;
			}
		}
		return a_counter;
	}

	// 3.
	/*
	 * method to return the number of array elements >= testValue with
	 * indices in [lowerBound, upperBound] using a while loop to examine the array
	 * elements.
	 */
	public int whileLoopTest(int lowerBound, int upperBound, int testValue, int[] values) {
		// TODO: - implement
		int a_counter = 0;
		while (lowerBound <= upperBound) {
			if (values[lowerBound] >= testValue) {
				a_counter++;
			}
			lowerBound++;
		}
		return a_counter;
	}

	// 4.
	/*
	 * method to return the number of array elements in [testValue1, testValue2] or
	 * [testValue2, testValue1] with indices in [lowerBound, upperBound] using a
	 * do-while loop to examine the array elements
	 */
	public int doWhileLoopTest(int lowerBound, int upperBound, int testValue1, int testValue2, int[] values) {
		// TODO: - implement
		int a_counter = 0;
		do {
			if (((testValue1 <= values[lowerBound]) && (values[lowerBound] <= testValue2))
					|| ((testValue2 <= values[lowerBound]) && (values[lowerBound] <= testValue1))) {
				a_counter++;
			}
			lowerBound++;
		} while (lowerBound <= upperBound);
		return a_counter;
	}

	// 5.
	/*
	 * method to return the number of array elements that match the switch cases
	 * [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
	 * and the default case with indices in [lowerBound, upperBound]
	 */
	public int[] switchTest(int lowerBound, int upperBound, int[] values) {
		// TODO: - implement
		int[] an_int_array = new int[11];
		for (int i = lowerBound; i <= upperBound; i++) {
			switch (values[i]) {
				case 0:
					an_int_array[0]++;
					break;
				case 2:
					an_int_array[1]++;
					break;
				case 4:
					an_int_array[2]++;
					break;
				case 6:
					an_int_array[3]++;
					break;
				case 8:
					an_int_array[4]++;
					break;
				case 10:
					an_int_array[5]++;
					break;
				case 12:
					an_int_array[6]++;
					break;
				case 14:
					an_int_array[7]++;
					break;
				case 16:
					an_int_array[8]++;
					break;
				case 18:
					an_int_array[9]++;
					break;
				default:
					an_int_array[10]++;
			}
		}
		return an_int_array;
	}
}