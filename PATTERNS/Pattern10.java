//Pascal's Triangle
/*
Pattern:
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
*/

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            int num = 1;
            for(int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
