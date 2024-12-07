package oops.modifier;
import oops.modifier.Access_specifeir;
public class main {

    static class subclass extends Access_specifeir{
        subclass(int num,String name){
            super(num,name);
        }
    }

    public static void main(String[] args) {
//       Access_specifeir s1=new Access_specifeir();
//        System.out.println(s1.name);
     //   System.out.println(s1.reg_no); //it cannot access because reg_no is variable.
        subclass sub=new subclass(123,"rahul");
        System.out.println(sub.num);
    }
}
