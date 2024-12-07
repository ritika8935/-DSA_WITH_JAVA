package oops;

public class wrapper_class {
    public static void main(String[] args) {

        Integer a=10;
        Integer b=20;
        swap(a,b);
        System.out.println(a+" "+b);

//        final int bonus=2;
//        bonus=9; //final cannot re-assign.

        final A riya=new A("riya");
        riya.name="other name"; //non-primitive final can be changed.

        //when a non primitive is final we cannot create new obj of it.
        //riya=new A("new object");

        A obj;
        for(int i=1;i<100000000;i++){
             obj=new A("random name");
        }
    }

    static void swap(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;

    }
}
class A{
    final int num=10;//final has to be initialized.
    String name;

    public A(String name){
        this.name=name;

    }

    //finalize is garbage collector,manually we cannot do garbage collection.
    @Override //finalize used to clear the garbage collection which are present in heap memory.
    protected void finalize() throws Throwable { //in java garbage destroyed automatically,so we just give some
        //instruction to java to follow ,while destroying obj..
        System.out.println("object is destroyed.");
    }
}
