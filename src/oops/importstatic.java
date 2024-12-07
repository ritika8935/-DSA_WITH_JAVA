package oops;
//if files are in some folder or package no need to write import statement.
public class importstatic {
    public static void main(String[] args) {
//      staticexample riya=new staticexample("riya",21,40000,false);
//      staticexample ritika=new staticexample("ritika",22,60000,false);
//        System.out.println(staticexample.population);
//        System.out.println(staticexample.population);

        importstatic funn=new importstatic();
        funn.fun2();
    }

    static void fun(){
   //     greeting();//we cant use this because requied an instance.
        //but function you are using it in does not depend on instance.
        //non-static member can not call in static member but static can call in non static member.


     //you cannot access non-static stuff without referencing their instance in static context.
        //here i am referencing it.
       importstatic obj=new importstatic();
       obj.greeting();
    }
    void fun2(){
        greeting();
    }
    //something which is non-static belongs to an obj.
    void greeting(){
        System.out.println("good Morning");
    }
}
//static is independent of obj,so when an member is declared static ,it can access before any of the class obj being created
// and without referencing to that object.