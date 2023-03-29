package sem4;

public class SumOfArray {
    public static void main(String[] args) {
        int a[] = {};
        System.out.println(sum(a));
    }

    public static String sum(int a[]) {
        int s = 0;
        if (a.length == 0)
            return "Array is empty";
        for (int i : a) {
            s = s + i;
        }
        return "" + s;
    }
}