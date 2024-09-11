package pattern;

public class practice {
    public static void main(String[] args) {
        p(5);
    }

    public static void p(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int totalcol = i > n ? 2 * n - i : i;

            int space = n - totalcol;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < totalcol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

