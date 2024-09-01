package pattern;

public class pattern {
    public static void main(String[] args) {
        p_1(4);
        System.out.println();
        p_2(5);
        System.out.println();
        p_3(5);
        System.out.println();
        p_4(5);
        System.out.println();
        p_5(5);
        System.out.println();
        p_6(5);
        System.out.println();
        p_7(5);
        System.out.println();
        p_8(4);
        System.out.println();
        p_9(4);
    }
    static void p_1(int n){
        for(int row = 1; row <=n; row++){
            for(int col = 1; col<= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p_2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p_3(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p_4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void p_5(int n){
        for(int i=1;i<=2*n;i++){
            int totalcolsinrow=i>n?2*n-i:i;
            for(int j=0;j<totalcolsinrow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p_6(int n){
        for(int i=1;i<=2*n;i++){
            int totalcol=i>n?2*n-i:i;

            int space=n-totalcol;
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }

            for(int j=0;j<totalcol;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p_7(int n){
        for(int i=1;i<=n;i++){
            for(int space=0;space<n-i;space++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j + " ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void p_8(int n){
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int ateveryindex=Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(ateveryindex+" ");
            }
            System.out.println();
        }
    }

    static void p_9(int n){
        int originalN=n;
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int ateveryindex=originalN-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(ateveryindex+" ");
            }
            System.out.println();
        }
    }
}
