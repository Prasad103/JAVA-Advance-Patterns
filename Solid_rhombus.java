public static void solidRhombus(int n) {
    //outer loop 
    for(int i=1; i<=n; i++) {
        //spaces - (n-1)
        for(int j=1; j<=(n-i); j++) {
            System.out.print(" ");
        }
        
        //stars
        for(int j=1; j<=n; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
