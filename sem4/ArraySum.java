//Q1. WAP which will return sum of all the elements of an integer array.
//Q2. WAP which will search an array for some given element.
//Q3. WAP for binary search in sorted array.

import java.util.*;
public class ArraySum {
    public static int sumArray(int arr[]) {
        if(arr.length == 0){
            return -1;
        }
        return sumArray(Arrays.copyOfRange(arr, 1, arr.length)) + arr[0];
    }

    static ArrayList<Integer> result = new ArrayList<>();
    public static ArrayList<Integer> getElements(int arr[], int index, int element) {
        
        if(index == arr.length){
            return result;
        }

        if(arr[index] == element){
            result.add(index);
        }

        return getElements(arr, index + 1, element);
    }

    public static int binarySearch(int arr[], int low, int high, int element) {
        Arrays.sort(arr);
        if(low >= high) {
            return -1;
        }

        int mid = (high + low) / 2;

        if(arr[mid] == element) {
            return mid;
        }

        if(arr[mid] > element) {
            binarySearch(arr, low, mid - 1, element);
        } else {
            binarySearch(arr, mid + 1, high, element);
        }

        return mid;
    }

    public static void main(String[] args) {
        int arr[] = {4,3,2,5,2,1,2,6,5,4};
        System.out.println(sumArray(arr));
        System.out.println(getElements(arr, 0, 5));
        System.out.println(binarySearch(arr, 0, arr.length - 1, 3));
    }
}
