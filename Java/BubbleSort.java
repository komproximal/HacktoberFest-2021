
import java.util.*;

class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // It will run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for every step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // if the item is smaller than the previous item, then swap
                if (arr[j] < arr[j-1]) {
                    // swap code
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you the code did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) {
                break;
            }
        }
    }
}
