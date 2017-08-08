package io.github.halcyon_daze.complex;

public class Complex {
    private int real;
    private int imaginary;

    Complex(int realCo, int imagCo) {
        real = realCo;
        imaginary = imagCo;
    }

    Complex(int realCo) {
        real = realCo;
        imaginary = 0;
    }

    void print() {
        if (imaginary == 0) {
            System.out.println(real);
        } else if (real == 0) {
            System.out.println(imaginary + "i");
        } else {
            System.out.println(real + " + " + imaginary + "i");
        }
    }
}
