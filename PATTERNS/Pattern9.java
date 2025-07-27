/*                      1
                2       2
        3       3       3
4       4       4       4 */
public class Pattern9 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) { 
                    System.out.print("\t");
                } else {
                    System.out.print(i + "\t");
                }
            }
            System.out.println();
        }
    }
}
