package java;

public class Upper {
    public static void main(String[] args) {
        String a = "abCdefGhIJKLMnop";
        String b = "ABCDEFghijklmn";
        System.out.println(a.charAt(b.length()));
        System.out.println(b.substring(0, 6));
        System.out.println(a.indexOf("F"));
        // System.out.println(a.toUpperCase());
        // System.out.println(a.toLowerCase());
        // System.out.println(a.length());
    }
}
