package oops.polymorphism;

public class methodOverloading {
    public static void main(String[] args) {
        calculator cals=new calculator();
        System.out.println(cals.sum(2,6));
        System.out.println(cals.sum(4.5f,1.2f));
        System.out.println(cals.sum(3,7,9));
    }
    static class calculator{
        int sum(int a,int b){
            return a+b;
        }
        float sum(float a,float b){
            return a+b;
        }
        int sum(int a,int b,int c){
            return a+b+c;
        }
    }
}
