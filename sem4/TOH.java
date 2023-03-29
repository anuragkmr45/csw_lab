package sem4;

public class TOH {
    public static void display() {

    }

    static int count = 0;

    static void toh(int n, char form_rod, char ta_rod, char aux_rod) {
        if (n == 0) {
            return;
        }
        toh(n - 1, form_rod, aux_rod, ta_rod);
        // System.out.println("move disk " + n + " from rod " + form_rod + " to rod " +
        // ta_rod);
        count++;
        toh(n - 1, form_rod, aux_rod, ta_rod);
    }

    public static void main(String[] args) {
        for (int N = 1; N < 10; N++) {
            toh(N, 'A', 'S', 'B');
            System.out.println("for n=" + N + " Steps = " + count);
        }
    }
}