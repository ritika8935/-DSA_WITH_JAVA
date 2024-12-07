package oops.polymorphism;

public class circle extends shapes{

    //it will run when obj of circle being created.
    //it is overriding the method of parents class.
    @Override//this is called annotation.
    void area(){
        System.out.println("pi*r*r");
    }
}
