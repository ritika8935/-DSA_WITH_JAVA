package oops;

public class Abstraction {
    public static void main(String[] args) {
     // Animal a=new Animal();//abstraction cls does not have object.
        mantang obj=new mantang();//if we call a child cls then first parents cls constructor called.
        //so sequence is Animal--horse--mantang.
    }
    abstract static class Animal{
        Animal(){//constructor can be implemented in the abstraction cls.
            System.out.println("hello animal constructor");
        }
         void eat(){
            System.out.println("eat");
        }
        abstract void walk();//abstraction cls just give the idea implementation not done.
    }
    static class horse extends Animal{
        horse(){
            System.out.println("hello horse constructor");
        }
       void walk(){//it is neccessary to implement the abstraction ideas.
           System.out.println("walks on 4 leg");
       }
    }
    static class mantang extends horse{
        mantang(){
            System.out.println("hello mantang constructor");
        }
    }
    class chiken extends Animal{
        void walk(){
            System.out.println("walks on 2 legs");
        }
    }
}
