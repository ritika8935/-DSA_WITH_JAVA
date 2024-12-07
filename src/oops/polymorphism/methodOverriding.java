package oops.polymorphism;

public class methodOverriding {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.eats();
    }
   static  class Animal{
        void eats(){
            System.out.println("eats anything");
        }
    }
    static class Deer extends Animal{
        void eats(){
            System.out.println("eats grass");
        }
    }
}
