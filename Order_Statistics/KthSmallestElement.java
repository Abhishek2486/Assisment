package Order_Statistics;

import java.util.Arrays;

public class KthSmallestElement {
	 // element in a given array
    public static int kthSmallest(Integer[] arr,int k)
                                  
    {
      
    Arrays.sort(arr);

        return arr[k - 1];
    }
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] {12, 3, 5, 4, 19, 26};
        int k = 4;
        System.out.print("K'th smallest element is " + kthSmallest(arr, k));
    }
}
