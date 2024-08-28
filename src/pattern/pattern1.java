package pattern;

public class pattern1 {
    public static void main(String[] args) {
      p_1(4);
    }
    static void p_1(int n){
        for(int row = 1; row <=n; row++){
            for(int col = 1; col<= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
