package MinValue;

public class MinValue {
    public static void main(String[] args) {

        int[] arr = {15, 24, 48, 2, 74, 39, 1, 75, 12, 43};
        int min = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("min = " + min + ", " + "index = " + index);
    }
}
