package sem4;

public class ArrayConcept {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int b[] = { 1, 2, 3, 4, 5, 6, 7, 9, 8 };
    }

    public static void print(int a[]) {
        System.out.println("elements in array are");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int search(int a[], int key, int low, int high) {
        if (a.length == 0 || low == high && a[low] != key)
            return -1;
        int mid = (low + high) / 2;
        if (a[mid] < key)
            return search(a, key, mid + 1, high);
        else if (a[mid] == key)
            return mid;
        else
            return search(a, key, low, mid - 1);
    }

    public static boolean equality(int a[], int b[]) {
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i])
                    return false;
            }
            return true;
        }
        return false;
    }

    public static void replace(int a[], int key, int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key)
                a[i] = value;
        }
    }

    public static void bubbleSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int a[]) {
        int n = a.length, key, j;
        for (int i = 1; i < n; ++i) {
            key = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }

    public static void selectionSort(int a[]) {
        int n = a.length, index, temp;
        for (int i = 0; i < n - 1; i++) {
            index = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[index])
                    index = j;
            temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }

}