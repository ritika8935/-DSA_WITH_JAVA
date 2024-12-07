package oops.practice;

//Printthesum,differenceandproductoftwocomplexnumbersbycreatingaclassnamed'Complex'
// withseparatemethodsforeachoperationwhoserealandimaginaryparts are entered by the user
 class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }

    public static Complex subs(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex((a.real * b.real), (a.imag * b.imag));
    }

    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }
}


    class Solution {
        public static void main(String[] args) {

            Complex c = new Complex(2, 7);
            Complex d = new Complex(7, 9);

            Complex e = Complex.add(c, d);
            Complex f = Complex.subs(c, d);
            Complex g = Complex.product(c, d);

            e.printComplex();
            f.printComplex();
            g.printComplex();
        }
    }


