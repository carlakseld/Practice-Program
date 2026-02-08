import java.util.*;

public class HelloDOS {

    public static void main(String args[]) {

        int N[], a, b;
        int[] x, y;

        Scanner scanner = new Scanner(System.in);

        N = new int[5];
        N[0] = 5;
        N[1] = 10;
        N[2] = 15;
        N[3] = 20;
        N[4] = 25;

        for (a = 0; a < N.length; ++a) {
            System.out.println(N[a]);
        }

        System.out.println();

        x = new int[5];
        for (a = 0; a < x.length; ++a) {
            x[a] = a + 1;
        }

        for (a = 0; a < x.length; ++a) {
            System.out.println(x[a]);
        }

        System.out.println();

        y = new int[10];
        int count = 4;

        for (b = 0; b < y.length; ++b) {
            y[b] = count;
            count += 4;
        }

        for (b = 0; b < y.length; ++b) {
            System.out.println(y[b]);
        }
    }
}