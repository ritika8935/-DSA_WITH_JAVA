package oops.polymorphism;

public class main {
    public static void main(String[] args) {
        shapes s=new shapes();
        circle c=new circle();
       // triangle t=new triangle();
        shapes t=new triangle();

        t.area();
    }

}
