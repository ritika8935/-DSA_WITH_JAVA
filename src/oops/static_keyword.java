package oops;

public class static_keyword {
    public static void main(String[] args) {
        Students s1=new Students();
        s1.schoolName="cit";
       // System.out.println(s1.schoolName);
        Students s2=new Students();
        s2.schoolName="jut";
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);

    }
    static class Students{
        String name;
        int roll;
        static String schoolName;

        static int marks(int phy,int maths,int chem){
           return phy+maths+chem;
        }//static function so this logic will same for all students.

        void setName(String name){
            this.name=name;
        }
        String getName(){
            return this.name;
        }
    }
}
