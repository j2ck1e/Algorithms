package MergeSorting;

import java.util.Arrays;

public class MergeSorting {
    public static void main(String[] args) {
        int[] testArray = {6, 3, 16, 78, 3, 9, 15};
        mergeSort(testArray, 0, testArray.length - 1);
        System.out.println(Arrays.toString(testArray));
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {


            int mid = (end + start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        } else return;
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int size1 = mid - start + 1;
        int size2 = end - mid;

        int[] arrLeft = new int[size1];
        int[] arrRight = new int[size2];

        for(int i = 0; i < size1; i++) {
            arrLeft[i] = arr[start + i];
        }
        for(int j = 0; j < size2; j++) {
            arrRight[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while(i < size1 && j < size2) {
            if(arrLeft[i] <= arrRight[j]) {
                arr[k] = arrLeft[i];
                i++;
            } else {
                arr[k] = arrRight[j];
                j++;
            }
            k++;
        }

        while(i < size1) {
            arr[k] = arrLeft[i];
            i++;
            k++;
        }

        while(j < size2){
            arr[k] = arrRight[j];
            j++;
            k++;
        }
    }
}
