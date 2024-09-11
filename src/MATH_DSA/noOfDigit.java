package MATH_DSA;

public class noOfDigit {
    public static void main(String[] args) {
        int n=34567;
        int base=10;
        int ans=(int)(Math.log(n)/Math.log(base))+1;
        System.out.println(ans);
    }
}
