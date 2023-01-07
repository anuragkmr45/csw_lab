package kuch;
class DemoEnc {
    private int ssnV, empAge;
    private String empName;

    public int getSsnV() {
        return ssnV;
    }

    public void setSsnV(int ssnV) {
        this.ssnV = ssnV;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}

public class TimePass {
    static boolean check(DemoEnc de1, DemoEnc de2) {
        String name1 = de1.getEmpName(), name2 = de2.getEmpName();
        if (name1.equals(name2))
            return true;
        else
            return false;
    }

    static String check1(DemoEnc de1) {
        Integer s1 = de1.getEmpAge();
        return s1.toString();
    }

    public static void main(String[] args) {
        DemoEnc de = new DemoEnc();
        de.setEmpAge(10);
        de.setEmpName("TimePass");
        de.setSsnV(1212);
        DemoEnc de1 = new DemoEnc();
        de1.setEmpAge(10);

        de1.setEmpName("TimePass");
        de1.setSsnV(1212);
        System.out.println("Age: " + de.getEmpAge() + "\nName: " + de.getEmpName() + "\nSsn value: " + de.getSsnV());
        System.out.println("Age: " + de1.getEmpAge() + "\nName: " + de1.getEmpName() + "\nSsn value: " + de1.getSsnV());
        System.out.println("Compare is: " + check(de, de1));
        System.out.println(check1(de));
    }
}
