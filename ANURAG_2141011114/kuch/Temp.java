package kuch;
public class Temp {
    public static void main(String[] args) {

        Complex c1 = new Complex(10, 15);

        System.out.println(c1);
    }
}
class Complex {

    private double re, im;

    public Complex(double re, double im) {

        this.re = re;
        this.im = im;
    }

    public double getReal() {
        return this.re;
    }

    public double getImaginary() {
        return this.im;
    }

    public void setReal(double re) {
        this.re = re;
    }

    public void setImaginary(double im) {
        this.im = im;
    }

    @Override
    public String toString() {
        return this.re + " + " + this.im + "i";
    }
}
