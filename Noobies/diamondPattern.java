public class diamondPattern {
    public static void main(String[] args) {
        int n = 5; // size of the pattern

        /*
        //upper part
        for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
        }


        //lower part
        for(int i=n; i>=1; i--) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
        }
        */

        //myLogic

        //first half
        int k=1;
        for (int i = 1; i <= n; i++) 
        {
            for(int j=i; j<n; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=k; j++)
            {
                System.out.print("*");
            }
            k+=2;
            System.out.println();
        }

        //second half
        int l=n;
        for (int i = n; i >= 1; i--) 
        {
            for(int j=n; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int j=l+2; j>=1; j--)
            {
                System.out.print("*");
            }
            l-=2;
            System.out.println();
        }
    }
}
