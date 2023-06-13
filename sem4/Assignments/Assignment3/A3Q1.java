// Given an array containing 0s and 1s. Write an algorithms to sort array so that 0s come first followed by 1s. Also find the minimum number of countSwaps required to sort the array.

public class A3Q1 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 1, 0 };
        int countSwap = sort01(arr);
        System.out.println("No of swaps : " + countSwap);

        System.out.print("Sorted Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int sort01(int[] array) {
        int countZero = 0;
        int countSwap = 0;

        for (int i : array) {
            if (i == 0) {
                countZero++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (countZero > 0) {
                array[i] = 0;
                countZero = countZero - 1;
            } else {
                array[i] = 1;
                countSwap = countSwap + 1;
            }
        }

        return countSwap;
    }
}