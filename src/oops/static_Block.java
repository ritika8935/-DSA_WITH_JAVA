package oops;
//initialization of static.
public class static_Block {
    static int a=5;
    static int b;
//will only run once when first obj is created.when class is loaded then only once it will run.
    static{
        System.out.println("Hello static block");
        b=a*5;
    }

    public static void main(String[] args) {
        static_Block obj=new static_Block();
        System.out.println(static_Block.a+" "+static_Block.b);

        static_Block.b +=3;
        System.out.println(static_Block.a+" "+static_Block.b);

        static_Block obj2=new static_Block();
        System.out.println(static_Block.a+" "+static_Block.b);



    }
}
