package oops;

public class staticexample {
    String name;
    int age;
    int salary;
    boolean married;
    static long population;//static not based on logic it will some for all obj.

    static void msg(){
        System.out.println("hello static");
     //   System.out.println(this.age);//we cant use this here because this used for obj and it is static.
    }

    public staticexample(String name,int age,int salary,boolean married){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.married=married;
        staticexample.population+=1;//static is declared with classname.
    }
}
