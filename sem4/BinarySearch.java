package sem4;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println(binary(a, 0, a.length, 5));
    }

    public static int binary(int a[], int low, int high, int key) {
        int mid = (low + high) / 2;
        if (low > high)
            return -1;
        else {
            if (a[mid] == key)
                return mid;
            else if (a[mid] < key)
                return binary(a, mid + 1, high, key);
            else
                return binary(a, low, mid - 1, key);
        }

    }
}