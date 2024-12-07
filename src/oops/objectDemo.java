package oops;

public class objectDemo {
    int num;
    String name;
    public objectDemo(int num,String name){
        this.num=num;
        this.name=name;
    }
    @Override
    public int hashCode() {
        return num;
    }

//    @Override
//    public boolean equals(Object obj) {
//        return this.num==((Object)obj).num;
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public static void main(String[] args) {
        objectDemo obj1=new objectDemo(55,"riya");
        objectDemo obj2=new objectDemo(55,"ritika");

        if(obj1 == obj2){
            System.out.println("camparing obj1 and obj2 with ==");
        }
        if(obj1.equals(obj2)){
            System.out.println("camparing obj1 and obj2 with equals");
        }
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj1 instanceof Object);
        System.out.println(obj1.getClass());
    }
}
