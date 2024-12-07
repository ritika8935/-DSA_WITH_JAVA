package oops;

public class constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Riya";
        s1.roll=23;
        s1.password=4562;
        s1.marks[0]=90;
        s1.marks[1]=79;
        s1.marks[2]=86;

        Student s2=new Student(s1);
        s2.password=7890;
        s1.marks[1]=99;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
    static class  Student{
        String name;
        int roll;
        int password;
        int marks[];

//        Student(Student s1){//shallow copy constructor
//            marks=new int[3];
//         this.name=s1.name;
//         this.roll=s1.roll;
//         this.marks=s1.marks;
//        }
        Student(Student s1) {//deep copy constructor
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for(int i=0;i<3;i++){
                this.marks[i]=s1.marks[i];
            }
        }

        Student(){
            marks=new int[3];
            System.out.println("Hello non-parameterized constructor");
        }
        Student(String nam){
            marks=new int[3];
            this.name=nam;
            System.out.println("Hello parameterized constructor");
        }
    }
}
