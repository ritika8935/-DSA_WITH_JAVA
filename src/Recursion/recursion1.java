package Recursion;

public class recursion1 {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        //base condition
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //recursive calls
        //it is called tail recursion
        //last function call
        print(n+1);
    }
}
