package BubbleSorting;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {15, 24, 48, 2, 74, 39, 1, 75, 12, 43};
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                    flag = false;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
