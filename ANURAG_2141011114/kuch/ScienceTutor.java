package kuch;

class Tutor {
    String designate = "Tutor";
    String academyName = "NewAcademy";

    void performs() {
        System.out.println("Tutoring");
    }
}

public class ScienceTutor extends Tutor {
    String subject = "Science";

    public static void main(String args[]) {
        ScienceTutor obj = new ScienceTutor();
        System.out.println(obj.academyName);
        System.out.println(obj.designate);
        System.out.println(obj.subject);
        obj.performs();
    }
}