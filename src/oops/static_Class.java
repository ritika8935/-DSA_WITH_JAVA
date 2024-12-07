package oops;

public class static_Class {//outer class cannot be static.
    static class test{//inner class needs to be static,if not then it will dependent on outer class.
        String name;

        public test(String name){//constructor
            this.name=name;
        }
    }

    public static void main(String[] args) {
        test obj1=new test("Riya");//we created obj for static cls bt inner class is static
        // which means it is not dependent on other cls, so it can depend on obj.
        test obj2=new test("ritika");
        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }
}
