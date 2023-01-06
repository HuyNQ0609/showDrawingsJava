import java.util.Scanner;
public class showDrawings {
    public static void main(String[] args) {
        Scanner draw = new Scanner(System.in);
        short choose, n, m;
        System.out.println("Enter choose of you: ");
        choose = draw.nextShort();
        if( choose > 0 && choose <= 4) {
            System.out.println("Enter the width: ");
            n = draw.nextShort();
            if( choose == 1) {
                System.out.println("Enter the width: ");
                m = draw.nextShort();
                System.out.println("Draw the rectangle: ");
                for( short i = 0; i < n; i++) {
                    System.out.println(" ");
                    for (short j = 0; j < m; j++) {
                        System.out.print("* ");
                    }
                }
            } else if( choose == 2) {
                System.out.println("Draw the triangle down-left: ");
                for( short i = 0; i < n; i++) {
                    System.out.println(" ");
                    for( short j = 0; j <= i; j++) {
                        System.out.print("* ");
                    }
                }
            } else if( choose == 3) {
                System.out.println("Draw the triangle top-left: ");
                for( short i = 0; i < n; i++) {
                    System.out.println(" ");
                    for( short j = 0; j < n - i; j++) {
                        System.out.print("* ");
                    }
                }
            } else {
                System.out.println("Draw the isosceles triangle: ");
                for ( short i = 0; i < n; i++) {
                    for (short j = 0; j < n - i; j++) {
                        System.out.print("  ");
                    }
                    for (short j = 0; j < 2 * i - 1; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("\n");
                }
            }
        } else {
            System.out.print("No choice!");
        }
    }
}