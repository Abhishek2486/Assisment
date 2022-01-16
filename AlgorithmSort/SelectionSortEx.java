package AlgorithmSort;

public class SelectionSortEx {

	public static void main(String[] args) {
		
		SelectionSortEx obj = new SelectionSortEx();

		int[] arr = { 45,3,6,8,23,43,89,12,};
		System.out.println("Befor sorting");
		obj.printArray(arr);
		obj.selectionSort(arr);
		System.out.println("After sorting");
		obj.printArray(arr);

	}

	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	void selectionSort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			int min_idx = i;
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
				
			}
			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		
		
	}
}
