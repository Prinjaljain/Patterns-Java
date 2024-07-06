public class FloydsTriangle {
    public static void ft(int n) {
        int prinjal = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(prinjal+" ");
                prinjal++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        ft(5);
    }
}
