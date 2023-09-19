public class Inverted_half_Pyramid_withNumbers {
    public static void inverted_half_pyramid_withNumbers(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.err.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        inverted_half_pyramid_withNumbers(5);
    }
}
