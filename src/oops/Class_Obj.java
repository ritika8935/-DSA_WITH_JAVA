package oops;

public class Class_Obj {
    public static void main(String[] args) {
        Color c=new Color();
        c.changecolor("Red");
        c.fixcost(23000);
        Student s1=new Student();
        s1.yourname("Ritika");
        s1.yourbatch("2k21");
        System.out.println(c.col+" "+ c.cost+" "+ s1.name+" " + s1.batch);

        Bankaccount b=new Bankaccount();
        b.username="Riya";
        b.setpassword("748");
       // System.out.println(b.setpassword("323"));//not allowed because not declare as int.
//        b.password="abc";
//        System.out.println(b.password);
        System.out.println(b.getpassword());
    }
    static class Bankaccount{
        public String username;
        private String password;
        public void setpassword(String pwd){
            this.password=pwd;
        }
        public String getpassword(){
            return this.password;
        }
    }
    static class Color{
        String col;
        int cost;

        void changecolor(String selected){
            col=selected;
        }
        void fixcost(int finalcost){
            cost=finalcost;
        }
    }
   static class Student{
        String name;
        String batch;

        void yourname(String nam){
            name=nam;
        }
        void yourbatch(String bat){
            batch=bat;
        }
    }
}
