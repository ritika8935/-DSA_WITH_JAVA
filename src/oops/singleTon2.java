package oops;
import oops.modifier.Access_specifeir;
public class singleTon2 extends Access_specifeir{

   public singleTon2(int num,String name){
       super(num,name);
   }
    public static void main(String[] args) {
        singleTon obj1= singleTon.getInstance();
        singleTon obj2= singleTon.getInstance();
        singleTon obj3=singleTon.getInstance();
        //all 3 ref pointing to a single obj.

        singleTon2 obj=new singleTon2(89,"tina");
        System.out.println(obj.num);
    }
}
