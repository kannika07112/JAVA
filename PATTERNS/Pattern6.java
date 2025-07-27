//Dimond Shape
/*
Pattern:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5; // height of the diamond (half)
        // Top pyramid
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for(int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        // Bottom inverted pyramid
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for(int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
