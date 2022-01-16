package AlgorithmSort;

public class InsertionSortex {
	public static void main(String[] args) {

		InsertionSortex obj = new InsertionSortex();

		int[] arr = {33,44,55,11,22,66,77,99,88,100};
		System.out.println("Befor sorting");
		obj.printArray(arr);
		obj.insertionSort(arr);
		System.out.println("After sorting");
		obj.printArray(arr);

	}

	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int pickedElement = arr[i];

			int j = i - 1;

			while (j >= 0 && arr[j] > pickedElement) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = pickedElement;

		}
	}
}
