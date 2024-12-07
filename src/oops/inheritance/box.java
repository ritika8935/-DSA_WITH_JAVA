package oops.inheritance;

public class box {
    double l;
    double h;
    double w;

   box(){
       this.h=-1;
       this.l=-1;
       this.w=-1;
   }
   box(double side){
       super();//obj cls
       this.w=side;
       this.l=side;
       this.h=side;
   }
   box(double l,double w,double h){
       this.l=l;
       this.w=w;
       this.h=h;
   }
   box(box old){
       this.h=old.h;
       this.l=old.l;
       this.w=old.w;
   }
   public void information(){
       System.out.println("Running the box");
   }

}
