package oops;

public class superKeyword {
    public static void main(String[] args) {
        Horse H=new Horse();
        System.out.println(H.color);
    }
    static class Animal{
        String color;
        Animal(){
            System.out.println("Animal constructor.");
        }
    }
    static class Horse extends Animal{
        Horse(){
            super.color="blue";
            System.out.println("Horse constructor.");
        }
    }
}
