package oops.modifier;

public class Access_specifeir {
   protected int num;//protected variable,it can access within cls,within package,subcls of same and diff both package.
    String name = "riya";//default variables,it can access within cls,within package,subcls of same package.
    String branch;//default variables.
    private int reg_no = 23455;//private variables,it can access within cls only.

    void nam(String name) {
        this.name = name;
    }

    void reg(int reg_no) {
        this.reg_no = reg_no;
    }

    void setnum(int num) {
        this.num=num;
    }

    int  getnum() {
        return this.num;
    }

    protected Access_specifeir(int num, String name){
        this.num=num;
        this.name=name;
    }



}

