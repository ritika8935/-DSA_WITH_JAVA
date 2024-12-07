package oops.polymorphism;

public class compiletime_poly {
    double sum(double a,int b){
        return a+b;
    }
    void sum(int a,int b,int c){

    }

    public static void main(String[] args) {
        compiletime_poly obj=new compiletime_poly();

        obj.sum(2,4);//convert integer value into double.
        obj.sum(1,7,9);
    }

}
