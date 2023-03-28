// Q1. Given an array you need to rotate it's elements k number of times.
// Q2. 

import java.util.*;

public class RotateElements {
    public static int[] rotateElements(int arr[], int k) {
        int count = 1;
        while (count <= k) {
            for (int i = 0; i < arr.length - 1; i++) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            count++;
        }
        return arr;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(Arrays.toString(rotateElements(arr, 1)));
    }
}
