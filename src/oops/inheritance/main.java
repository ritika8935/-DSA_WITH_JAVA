package oops.inheritance;
import oops.modifier.Access_specifeir;
public class main {

    public static void main(String[] args) {
        box b=new box(6);
       // box b2=new box(6);
      //  System.out.println(b.l+" "+b.w+" "+b.h+" ");
        box b2=new box(b);
        System.out.println(b2.l+" "+b2.w+" "+b2.h+" ");

        boxWeight Box=new boxWeight(1,5,0,4);//child class obj can access the properties of parent class.
        //but if obj is created of parent class it cant access the child class properties.
        System.out.println(Box.l+" "+Box.w+" "+Box.h+" "+Box.weight);

        box b3=new boxWeight(3,7,1,9);//parent class referencing to child cls.
        //System.out.println(b3.weight);
       // boxWeight b3=new box(3,7,1,9);//child clas cant ref to parent cls.



    }
}
