package AlgorithmSort;

public class BubbleSort {
public static void main(String[] args) {
	BubbleSort obj = new BubbleSort();

	int[] arr = { 33,44,55,11,22,66,77,99,88,100};
	System.out.println("Befor sorting");
	obj.printArray(arr);
	obj.bubbleSort(arr);
	System.out.println("After sorting");
	obj.printArray(arr);

}

void printArray(int[] arr) {
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
}

void bubbleSort(int arr[]) {

	for (int i = 0; i < arr.length; i++) {

		for (int j = 1; j < arr.length; j++) {

			if (arr[j - 1] > arr[j]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
			}
		}
	}
}
}

