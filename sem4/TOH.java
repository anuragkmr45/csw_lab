public class TOH {
    static void toh(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println(n + "plate transfer form " + src + " to " + dest);
            return;
        }

        toh(n - 1, src, dest, helper);
        System.out.println(n - 1 + " plates transfer form " + src + " to " + helper);

        toh(n - 1, helper, src, dest);
    }
}
