public class Inverted_Rotated_Half_Pyramid {
    public static void inverted_rotated_half_pyramid(int n) {
        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //star print
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }


    public static void main(String args[]) {
        inverted_rotated_half_pyramid(5);
    }
}

