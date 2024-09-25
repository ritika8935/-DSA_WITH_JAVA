package oops;

public class class_obj_constructor {
    public static void main(String[] args) {

      //  Student std1=new Student();//initializing an obj is very important.

//        std1.rollno=45; //bydefault 0.
//        std1.name="riya";//bydefault null.
//        std1.marks=89.5f;//bydefault 0.0.

//        System.out.println(std1.rollno);
//        System.out.println(std1.name);
//        System.out.println(std1.marks);

//        Student std2=new Student(70,"ritika",90f);
//        System.out.println(std1.rollno);
//        System.out.println(std1.name);
//        System.out.println(std2.marks);


        //both random and random2 refering to singal object.
        Student random=new Student();
        Student random2=random;
        System.out.println(random2.rollno);
        System.out.println(random2.name);
        System.out.println(random2.marks);

    }
}
//class in java
class Student{
    int rollno;
    String name;
    float marks;

    //constructor-is a special function runs when we create an object and allocates some variables.
    Student(){
//        this.rollno=16;
//        this.name="riya";
//        this.marks=78.4f;
        this(45,"rahul",67.4f);//constructor inside constructor
    }
    Student(int rollno,String name,float marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
}
